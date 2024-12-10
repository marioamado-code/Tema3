package boletin.strings;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// introducimos la variable string clave
		String clave;
		// variable pista
		int pista;

		// variable palabra que va poniendo el jugador 2
		String palabra;
		// pedimos al primer jugador la clave
		System.out.println("Introduzca clave jugador 1");
		clave = sc.nextLine();
		// creamos un for para poner espacios y que no se vea la clave cuando le toque
		// al otro
		for (int i = 0; i < 25; i++) {
			System.out.println();
		}
		// pedimos al jugador 2 que introduzca una palabra
		do {
			System.out.println("Jugador 2, introduzca clave a adivinar");
			palabra = sc.nextLine();
			// comparamos las cadenas
			pista = palabra.compareTo(clave);
			// vemos las posibles soluciones e imprimimos en los casos
			if (pista > 0) {
				System.out.println("La palabra es menor alfabéticamente");
			} else if (pista < 0) {
				System.out.println("La palabra es mayor alfabéticamente");
			} else {
				System.out.println("Enhorabuena, fin del juego");
			}
		} while (pista != 0);
		// cerramos el escáner
		sc.close();
	}

}
