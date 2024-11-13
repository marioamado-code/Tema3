package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Introducimos la variable numero de filas
		int filas;
		// Introducimos la variable numero de columnas
		int columnas;
		// Introducimos la tabla
		int tabla[][];
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el numero de filas
		System.out.println("Introduzca numero de filas");
		filas = sc.nextInt();
		// Pedimos al usuario el numero de columnas
		System.out.println("Introduzca numero de columnas");
		columnas = sc.nextInt();
		// Iniciamos la tabla con los datos introducidos
		tabla = new int[filas][columnas];
		// Creamos el for de las filas
		for (int i = 0; i < tabla.length; i++) {
			// Creamos el for de las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				// imprimimos en el lugar indicado
				tabla[i][j] = 10 * (i + j);
			}
		}
		// imprimimos la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Creamos el for de las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");

			}
			System.out.println();
		}
		//Cerramos el escaner
		sc.close();
	}
}
