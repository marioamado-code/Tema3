package boletincolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// creamos la colección
		ArrayList<Integer> numeros = new ArrayList<>();
		// creamos la variable de cada numero aleatorio
		int num;
		// creamos la variable tamaño
		int tam;
		// creamos las variables donde almacenaremos las operaciones
		int suma = 0;
		double media;
		int max;
		int min;
		// creamos el random
		Random rand = new Random();
		// creamos el tamaño
		tam = rand.nextInt(5, 11);
		// en este for iremos añadiendo numeros aleatorios a la suma y a la lista
		for (int i = 0; i < tam; i++) {
			num = rand.nextInt(0, 100);
			numeros.add(num);
			suma += num;

		}
		// con estos metodos calculamos el maximo y minimo de la lista
		min = Collections.min(numeros);
		max = Collections.max(numeros);
		// calculamos la media
		media = (double) suma / tam;
		// imprimimos los resultados
		System.out.println("media igual a: " + media);
		System.out.println("suma igual a: " + suma);
		System.out.println("máximo igual a: " + max);
		System.out.println("mínimo igual a: " + min);
	}

}
