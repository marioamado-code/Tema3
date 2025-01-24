package boletincolecciones;

import java.util.TreeSet;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// constante fin
		final String FIN = "fin";
		// conjunto que va comparando su valor, si es string su orden alfabetico 
		TreeSet<String> nombres = new TreeSet<>();
		// variable que almacena el nombre
		String nombre = "";
		// escaner
		Scanner sc = new Scanner(System.in);
		// pedimos el dato y lo leemos
		System.out.println("Introduce nombre");
		nombre = sc.nextLine();
		// mientras no sea igual se van añadiendo los nombres y se pide otra vez
		while (!nombre.equalsIgnoreCase(FIN)) {
			nombres.add(nombre);
			System.out.println("Introduce nombre");
			nombre = sc.nextLine();
		}
		// se imprimen los nombres
		System.out.println(nombres);
		
		sc.close();

	}

}
