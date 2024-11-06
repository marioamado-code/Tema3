package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos la variable numero introducido por el usuario
		double numero;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);

		// Creamos la tabla
		double tabla[] = new double[10];
		// Creamos el for que se repetira diez veces
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos el numero
			System.out.println("Introduzca numero");
			// Lo leemos
			numero = sc.nextDouble();
			// Lo guardamos en la tabla
			tabla[i] = numero;
		}
		// fuera del bucle hacemos otro bucle que imprima desde tabla length hasta 0
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}
		// Cerramos el escáner
		sc.close();

	}

}
