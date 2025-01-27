package boletin2colecciones;

import java.util.LinkedHashSet;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random rand = new Random();
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		int numero;
		int cont = 0;
		while (cont < 10) {
			numero = rand.nextInt(1, 21);
			if (numeros.add(numero)) {

				cont++;
			}
		}
		System.out.println(numeros);
	}

}
