package boletin7;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos la matriz
		int[][] matriz;
		final int tam = 5;
		int columna;
		int nada=0;
		int j1=1;
		int j2=2;
	
	Scanner sc = new Scanner(System.in);
	
		// Le damos el valor a la matriz
		matriz = new int[tam][tam];
		// imprimimos la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(nada);
			}
			System.out.println("");
		}
		// pedimos al jugador 1 que introduzca la posición de su ficha, que será un
		// círculo
		System.out.println("Introduzca columna jugador 1");
		columna = sc.nextInt();
		
		// creamos un while que parará cuando este en la fila tam -1 o cuando se
		// encuentre con otra, para esto haremos que cada vez
		//que se pone en una columna se suma al contador de esa columna uno
		matriz[matriz.length-1][columna]=j1;
		sc.close();
	}

}
