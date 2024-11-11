package boletin2;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la clase random
		Random rand = new Random();
		// Creamos la variable numero
		int num;
		// Creamos un contador
		int cont = 0;
		// creamos la tabla
		int tabla[] = new int[1000];
		// Creamos el escaner
		Scanner sc = new Scanner(System.in); // Creamos el for para que se repita 1000 veces
		for (int i = 0; i < tabla.length; i++) {
			// Creamos el numero random
			int numeroRandom = rand.nextInt(0, 100);
			// Lo guardamos en la tabla
			tabla[i] = numeroRandom;

		}
		// Pedimos el numero al usuario
		System.out.println("Introduzca numero");
		num = sc.nextInt();
		// Creamos un for que vaya desde el 0 a 1000 y que vaya contando las veces que
		// el numero es igual al numero random
		for (int i = 0; i < tabla.length; i++) {
			if (num == tabla[i]) {
				cont++;
			}
		}
		//Imprimimos el resultado
		if(cont==0) {
			System.out.println("El valor no existe en el array");
		}else {
			System.out.println("El valor existe en el array "+cont+ " veces");
		}
		//Cerramos el escaner
		sc.close();
	}
}
