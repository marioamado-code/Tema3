package boletin5;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int alto;
		int ancho;
		int[][]tabla;
		Scanner sc = new Scanner(System.in);

		// Leemos las dimensiones
		System.out.print("Introduzca alto de la tabla: ");
		 alto = sc.nextInt();
		System.out.print("Introduzca ancho de la tabla: ");
		 ancho = sc.nextInt();

		// Creamos la tabla
		 tabla = new int[alto][ancho];
		System.out.println("Introduzca los valores de la tabla:");
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				tabla[i][j] = sc.nextInt();
			}
		}

		// Mostramos la tabla original
		System.out.println("Tabla original:");
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		// Llamamos a la función traspuesta
		int[][] transpuesta = traspuesta(tabla, ancho, alto);

		// Mostramos la tabla transpuesta
		System.out.println("Tabla transpuesta:");
		for (int i = 0; i < transpuesta.length; i++) {
			for (int j = 0; j < transpuesta[i].length; j++) {
				System.out.print(transpuesta[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

	// Función para calcular la traspuesta
	static int[][] traspuesta(int tabla[][], int ancho, int alto) {
		int[][] resultado = new int[ancho][alto];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				resultado[j][i] = tabla[i][j];
			}
		}
		return resultado;
	}
}
