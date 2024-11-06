package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la variable numero introducido por el usuario
		double numero;
		// Creamos la variable que almacenará la suma
		int suma = 0;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);

		// Creamos la tabla
		double tabla[] = new double[10];
		// Creamos el for que se repetira diez veces
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos el numero
			System.out.println("Introduzca numero");
			// Lo leemos
			numero = sc.nextDouble();
			// Lo guardamos en la tabla
			tabla[i] = numero;
		}

		// Creamos la variable numero maximo y minimo que se inicializan en el primer numero del
		// array
		double max=tabla[0];
		double min=tabla[0];
		//Creamos un for each 
		for (double valor : tabla) {
			//Vamos sumando terminos a la variable suma
			suma += valor;
			//Vamos asignando mayores y menores
			max=Math.max(max,valor);
			min=Math.min(min, valor);
		}
		//imprimimos el resultado
		System.out.println("El mayor es "+max+", el menor es "+min);
		System.out.println("La suma es " + suma);
		// Cerramos el escáner
		sc.close();

	}

}
