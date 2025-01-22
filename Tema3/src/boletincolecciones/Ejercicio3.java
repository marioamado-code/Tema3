package boletincolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		final int NUMEROS = 30;
		// creamos la colección
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		//generamos el random
		Random rand = new Random();
		//creamos el numero aleatorio
		int numero;
		//creamos el for para ir añadiendo en la lista los numeros
		for (int i=0;i<NUMEROS;i++) {
			numero = rand.nextInt(1, 11);
			listaNumeros.add(numero);

		}
		//ordenamos la lista y la imprimimos
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
	}

}
