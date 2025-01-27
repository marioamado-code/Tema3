package boletin2colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {
		// creamos la colección y añadimos los numeros
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		//la imprimimos ordenada
		System.out.println("ordenada: "+numeros);
		//lo desordenamos en otro arraylist
		Collections.shuffle(numeros);
		System.out.println("desordenada: "+numeros);
		

	}

}
