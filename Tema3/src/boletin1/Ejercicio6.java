package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Introducimos la variable numero introducido
		int num;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Creamos la tabla de ocho numeros
		int tabla[] = new int[8];
		// Creamos el for guardando los numeros en la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos el numero
			System.out.println("Introduzca numero");
			// Lo leemos
			num = sc.nextInt();
			// Lo guardamos en la tabla
			tabla[i] = num;
		}
		// Creamos el array que volvera a leer los numeros
		for (int i = 0; i < tabla.length; i++) {
			// Imprimimos el numero correspondiente
			System.out.print(tabla[i]);
			// Hacemos un if para ver si es par o impar
			if (tabla[i] % 2 == 0) {
				System.out.println(" par");
			} else

				System.out.println(" impar");
		}
		// Cerramos el escaner
		sc.close();
	}

}
