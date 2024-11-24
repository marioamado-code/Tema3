package boletin5;

import java.util.Scanner;

public class Ejercicio3 {

	// Método principal
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);

		// Pedimos al usuario el tamaño de la matriz
		System.out.print("Introduce el tamaño de la matriz cuadrada (número de filas y columnas): ");
		 num = scanner.nextInt();

		// Creamos la matriz
		int[][] matriz = new int[num][num];

		// Rellenamos la matriz con los valores ingresados por el usuario
		System.out.println("Introduce los elementos de la matriz:");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}

		// Verificamos si la matriz es simétrica y mostramos el resultado
		System.out.println("¿La matriz es simétrica? " + esSimetrica(matriz));
		scanner.close();
	}

	public static boolean esSimetrica(int[][] matriz) {
		boolean estado=true;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					estado= false; // Retorna false si no es simétrica
				}
			}

		}
		
		return estado; // Retorna true si es simétrica
	}

}
