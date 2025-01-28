package boletin2colecciones;


import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int opcion;
		boolean quedarse = true;
		String serie = "";
		double valoracion;
		HashMap<String, Double> series = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1: Agregar serie: \r\n" + "2: Buscar serie: \r\n" + "3: Eliminar serie:\r\n"
					+ "4: Salir:\r\n" + "");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1 -> {
				System.out.println("Introduce nombre de la serie");
				serie = sc.nextLine();
				System.out.println("Introduce valoración de dicha serie");
				valoracion = sc.nextDouble();
				sc.nextLine();
				series.put(serie, valoracion);

			}
			case 2 -> {
				System.out.println("Di una serie que esté en la lista");
				serie = sc.nextLine();
				if (series.containsKey(serie)) {
					System.out.println("Su valoración es " + series.get(serie));
				} else {
					System.out.println(serie + " no está en la lista");
				}
			}
			case 3 -> {
				System.out.println("Di una serie que esté en la lista para eliminarla");
				serie = sc.nextLine();
				if (series.containsKey(serie)) {
					series.remove(serie);
				} else {
					System.out.println(serie + " no está en la lista");
				}
			}

			case 4 -> {
				quedarse = false;
			}

			}
		} while (quedarse);
		sc.close();
	}

}
