package boletincolecciones;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	public static void main(String[] args) {
		// constante del tamaño
		final int TAMAÑO = 20;
		// creamos la colección
		TreeSet<Integer> numeros = new TreeSet<>();

		// generamos el random
		Random rand = new Random();
		// mientras el tamaño sea mayor al conjunto
		while (numeros.size() < TAMAÑO) {
			numeros.add(rand.nextInt(0, 100));

		}
		// imprimimos el conjunto
		System.out.println(numeros);
	}

}
