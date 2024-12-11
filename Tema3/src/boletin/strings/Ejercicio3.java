package boletin.strings;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// introducimos la variable string cadena
		String cadena;

		// pedimos la frase y la leemos
		System.out.println("Introduzca frase");
		cadena = sc.nextLine();
		int cont = cuentaEspacios(cadena);
		System.out.println("La frase tiene "+cont+" espacios");
		sc.close();
	}

	// vemos cuantos espacios tiene
	static int cuentaEspacios(String frase) {
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				cont++;
			}

		}
		return cont;
	}
}
