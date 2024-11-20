package boletin4;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la tabla t

		int t[] = { 12, 11, 13, 14, 65, 78, 11, 12, 56, 98, 65, 11, 13, 14, 78, 99 };
		int tabla[];
		// creamos el valor a buscar
		int valor;

		// Creamos el escaner

		Scanner sc = new Scanner(System.in);
		// pedimos el numero
		System.out.println("Introduzca numero a buscar");
		// lo leemos
		valor = sc.nextInt();

		tabla = buscarTodos(t, valor);
		// Imprimimos la tabla
		System.out.print(Arrays.toString(tabla));
		// cerramos el escaner
		sc.close();
	}
	//Creamos la función
	static int[] buscarTodos(int t[], int valor) {
		//Iniciamos la tabla a la longitud de la otra
		int tabla[] = new int[t.length];
		//el for recorrerá la tabla entera
		for (int i = 0; i < t.length; i++) {
			//si es igual ese valor cambia de nada a ese valor
			if (t[i] == valor) {
				tabla[i] = t[i];
			}
		}
		//devolvemos la tabla
		return tabla;
	}
}
