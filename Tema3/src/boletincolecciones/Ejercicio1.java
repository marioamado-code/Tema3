package boletincolecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// creamos la colección
		ArrayList<Integer> numeros = new ArrayList<>();
		// creamos la variable de cad numero
		int num;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// pedimos el numero y lo leemos
		System.out.println("Introduzca numero");
		num = sc.nextInt();
		// hacemos un while mientras el numero sea mayor que cero
		while (num > 0) {
			numeros.add(num);
			// pedimos el numero y lo leemos otra vez
			System.out.println("Introduzca numero");
			num = sc.nextInt();
		}
		// creamos un for para ir recorriendo la lista creada
		for (int i = 0; i < numeros.size(); i++) {
			// si el resto es 0 del indice se imprime lo que hay en ese indice
			if (i % 2 == 0) {
				System.out.println(numeros.get(i));
			}
		}
		sc.close();
	}
}
