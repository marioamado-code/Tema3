package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos la tabla t

		int t[] = { 12, 11, 13, 14, 2, 6 };
		
		// creamos la variable suma de n numeros
		int salto;
		
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// pedimos de cuanto será la agrupación
		System.out.println("de cuanto será la agrupación");
		// Lo leemos
		salto = sc.nextInt();
		
		// creamos la variable n numeros
				int resultado[]=suma(t,salto);
		// Imprimimos la tabla
				System.out.print(Arrays.toString(resultado));
				sc.close();
			}
	static int[] suma(int t[], int numElementos) {
		// el tamaño de la tabla resultante es longitud - numElementos +1
		int[] result = new int[t.length - numElementos + 1];

		// Recorremos la tabla resultante y así nos aseguramos que no nos salimos de los
		// límites
		for (int i = 0; i < result.length; i++) {
			// Las posiciones que tengo que sumar del array van desde i (posición de la
			// resultante que tengo que rellenar) hasta i+numElementos-1
			for (int j = i; j < i + numElementos; j++) {
				result[i] += t[j];
			}
		}

		return result;
	}
}
