package boletin.strings;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// creamos la variable palabra
		String palabra = "";
		// creamos la variable frase
		String frase = "";
		Scanner sc = new Scanner(System.in);
		// pedimos la palabra
		System.out.println("Introduzca palabra");
		palabra = sc.nextLine();
		// pedimos la frase
		System.out.println("Introduzca frase");
		frase = sc.nextLine();
		// imprimimos el resultado
		System.out.println("La palabra aparece en la frase " + cuantasHay(palabra, frase) + " veces");
		sc.close();
	}

//creamos la función
	static int cuantasHay(String palabra, String frase) {
		
		// Convertir la frase a minúsculas para comparación sin distinción de
		// mayúsculas/minúsculas
		frase = frase.toLowerCase();
		palabra = palabra.toLowerCase();

		// Dividir la frase en palabras utilizando espacios como delimitadores
		String[] palabras = frase.split("\\s+");

		int contador = 0;

		// Contar cuántas veces aparece la palabra en la frase
		for (String palabraActual : palabras) {
			if (palabraActual.equals(palabra)) {
				contador++;
			}
		}

		return contador;
	}

}
