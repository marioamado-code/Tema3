package boletin1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la clase random
		Random rand = new Random();

		// creamos la tabla
		int tabla[] = new int[10];
		// Creamos el for para que se repita 10 veces
		for (int i = 0; i < tabla.length; i++) {
			// Creamos el numero random
			int numero = rand.nextInt(1, 101);
			// Lo guardamos en la tabla
			tabla[i] = numero;

		}
		// Imprimimos la tabla
		System.out.print(Arrays.toString(tabla));
	}

}
