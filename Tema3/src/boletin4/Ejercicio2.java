package boletin4;

import java.util.Scanner;

public class Ejercicio2 {
	// Creamos la función
	static int maximoTabla(int[] tabla) {
		int maximo = tabla[0];
		for (int valor : tabla) {
		if(valor>maximo) {
			maximo=valor;
		}
		}
		return maximo;
	}

	public static void main(String[] args) {
		// Creamos la tabla y su tamaño
		int tabla[];
		int tamaño;
		// Creamos el escaner
		Scanner scanner = new Scanner(System.in);
		// Pedimos al usuario el tamaño de la tabla
		System.out.print("¿Cuántos números tendrá la tabla? ");
		tamaño = scanner.nextInt();

		// Le damos el tamaño a la tabla
		tabla = new int[tamaño];

		// Pedimos al usuario que introduzca los valores de la tabla
		System.out.println("Introduce los números de la tabla:");
		for (int i = 0; i < tamaño; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			tabla[i] = scanner.nextInt();
		}
		// Llamamos a la función y mostramos el resultado
		int maximo = maximoTabla(tabla);
		System.out.println("El elemento más grande de la tabla es: " + maximo);
		// Cerramos el escaner
		scanner.close();

	}

}
