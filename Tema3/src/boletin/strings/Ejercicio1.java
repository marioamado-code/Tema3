package boletin.strings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// introducimos la variable string palabra 1 y palabra 2
		String frase1;
		String frase2;
		// longitud para medir las frases
		int longitud1;
		int longitud2;
		// Pedimos al usuario las dos palabras y lo leemos
		System.out.println("Introduzca frase");
		frase1 = sc.nextLine();
		System.out.println("Introduzca otra frase");
		frase2 = sc.nextLine();
		// comparamos las cadenas
		longitud1 = frase1.length();
		longitud2 = frase2.length();
		//hacemos los casos hipteticos e imprimimos la solución
		if (longitud1 < longitud2) {
			System.out.println("La primera frase es más corta");

		} else if (longitud2 < longitud1) {
			System.out.println("La segunda frase es más corta");
		} else {
			System.out.println("Las dos frases tienen la misma extensión");
		}
		//cerramos el escáner
		sc.close();
	}

}
