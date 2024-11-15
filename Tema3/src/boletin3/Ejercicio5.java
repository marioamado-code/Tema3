package boletin3;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la variable suma de filas y columnas y total
		int total = 0;
		int sumaFila = 0;
		int sumaColumna = 0;
		
		// Creamos la tabla de 4*5
		int tabla[][] = new int[4][5];
		// Creamos la clase random
		Random rand = new Random();
		// Creamos el numero random
		int numero = 0;
		// Creamos un for para las filas
		for (int i = 0; i < tabla.length; i++) {
			// Creamos el for de las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				numero = rand.nextInt(100, 1000);
				tabla[i][j] = numero;
				System.out.print(numero + "\t ");
				// Sumamos los numeros de la fila

				sumaFila += numero;
			}
			// Lo pegamos y saltamos de linea
			System.out.println(sumaFila);
			total += sumaFila;
			sumaFila = 0;
		}
		
		for (int j = 0; j < tabla[0].length; j++) {
			
		for (int i = 0; i < tabla.length; i++) {
			
		sumaColumna+=tabla[i][j];
			}
			System.out.print(sumaColumna + "\t");
			sumaColumna =0;
			
		}
		System.out.println(total);
	}
}
