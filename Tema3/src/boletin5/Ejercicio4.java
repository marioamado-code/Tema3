package boletin5;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Declaramos la tabla y su tamaño
		int tam;
		int[][]matriz;
		Scanner scanner = new Scanner(System.in);

		// Pedimos al usuario el tamaño de la matriz
		System.out.print("Introduce el tamaño de la matriz (NxN): ");
		 tam = scanner.nextInt();

		// Damos valor a la matriz
		 matriz = new int[tam][tam];

		// Rellenamos la matriz con datos proporcionados por el usuario
		System.out.println("Introduce los elementos de la matriz:");
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}

		// Verificamos si la matriz es mágica
		if (esMagica(matriz)) {
			System.out.println("La matriz es mágica.");
		} else {
			System.out.println("La matriz no es mágica.");
		}

		scanner.close();
	}

	public static boolean esMagica(int[][] tabla) {
		//Declaramos la longitud de la tabla y el bbolean que nos dará el resultado
		int num = tabla.length;
		boolean esMagica = true;

		// Sumamos la primera fila como referencia
		int sumaReferencia = 0;
		for (int j = 0; j < num; j++) {
			sumaReferencia += tabla[0][j];
		}

		// Comprobamos las filas
		for (int i = 0; i < num && esMagica; i++) {
			int sumaFila = 0;
			for (int j = 0; j < num; j++) {
				sumaFila += tabla[i][j];
			}
			if (sumaFila != sumaReferencia) {
				esMagica = false;
			}
		}

		// Comprobar las columnas
		for (int j = 0; j < num&& esMagica; j++) {
			int sumaColumna = 0;
			for (int i = 0; i < num; i++) {
				sumaColumna += tabla[i][j];
			}
			if (sumaColumna != sumaReferencia) {
				esMagica = false;
			}
		}

		// Comprobamos las diagonales
		int sumaDiagonalPrincipal = 0;
		int sumaDiagonalSecundaria = 0;
		for (int i = 0; i < num; i++) {
			sumaDiagonalPrincipal += tabla[i][i];
			sumaDiagonalSecundaria += tabla[i][num - 1 - i];
		}
		if (sumaDiagonalPrincipal != sumaReferencia || sumaDiagonalSecundaria != sumaReferencia) {
			esMagica = false;
		}

		return esMagica;
	}
}
