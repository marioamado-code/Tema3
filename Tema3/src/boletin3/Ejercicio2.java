package boletin3;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos la tabla
		double tabla[][] = new double[4][5];
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// Creamos el for de las filas
		for (int i = 0; i < tabla.length; i++) {
			// Creamos el for de las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				// Imprimimos la pregunta
				System.out.println("Introduzca nota " + (j + 1) + " del alumno " + (i + 1));
				// Lo leemos
				tabla[i][j] = sc.nextDouble();
			}
			
		}
		// Hacemos un segundo for para imprimir la tabla
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				System.out.print(tabla[i][j] + " ");

			}
			System.out.println();
		}
		
		sc.close();
	}

}
