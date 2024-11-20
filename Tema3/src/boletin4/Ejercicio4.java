package boletin4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la tabla t

		int t[] = { 12, 11, 13, 14, 65, 78 };

		int resultado;

		int clave;

		// Creamos el escaner

		Scanner sc = new Scanner(System.in);
		//pedimos el numero
		System.out.println("Introduzca numero clave");
		//lo leemos
		clave = sc.nextInt();
		//Llamamos a la función
		resultado = buscar(t, clave);
		//Hacemos la respuesta segun las opciones
		if (resultado != -1) {
			System.out.println("La clave se encuentra en la posición: " + resultado);
		} else {
			System.out.println("La clave no se encuentra en el array.");
		}
		// Cerramos el escaner
		sc.close();
	}
	//Creamos la función
	static int buscar(int t[], int clave) {
		//Creamos el indice
		int indice = 0;
		//Creamos el boolean para salir del while
		boolean enc = false;
		//Creamos el while hasta que se acabe la tabla o encuentre el numero
		while (indice < t.length && !enc) {
			//si es igual se sale del bucle
			if (t[indice] == clave) {
				enc = true;
			} else {
				// si no se va aumentando
				indice++;
			}

		}
		//si no se encontro se devuelve -1
		if (!enc) {
			indice = -1;
		}
		// devolvemos el indice
		return indice;
	}
}
