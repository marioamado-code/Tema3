package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Introducimos la variable valor
		int valor;
		// Introducimos la tabla
		int tabla[] = new int[8];

		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// Hacemos un for para la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca valor");
			valor = sc.nextInt();
			// Lo guardamos en la tabla
			tabla[i] = valor;

		}
		// Ahora ordenamos la tabla de menor a mayor
		Arrays.sort(tabla);
		// Ahora la mostramos desde el final hasta el comienzo con otro for
		for (int i = tabla.length - 1; i >= 0; i--) {
			// Imprimimos la tabla
			System.out.print(" " + tabla[i]);
		}

		// Cerramos el escaner
		sc.close();
	}

}
