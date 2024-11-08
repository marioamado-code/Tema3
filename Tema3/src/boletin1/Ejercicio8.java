package boletin1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Introducimos la tabla numeros
		int numeros[] = new int[100];
		int numIntroducido;
		// Introducimos el escaner
		Scanner sc = new Scanner(System.in);

		// Creamos la clase random
		Random rand = new Random();

		// Creamos un for para cada numero de la tabla
		for (int i = 0; i < numeros.length; i++) {
			// Creamos el numero random
			int numero = rand.nextInt(1, 11);
			// Lo asociamos con una posición
			numeros[i] = numero;
		}
		// Pedimos un valor n entre 1 y 10
		System.out.println("introduzca numero del 1 al 10");
		numIntroducido = sc.nextInt();
		// Hacemos un for y vamos comparando el numero introducido con el que esta ahi
		for (int i = 0; i < numeros.length; i++) {
			// Hacemos un if para ver si es igual o no e imprimimos la posicion del array en
			// la que esta
			if (numIntroducido == numeros[i]) {
				System.out.print(" " + i);
			}
		}
		// Cerramos el escaner
		sc.close();
	}

}
