package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos la variable numero introducido por el usuario
		double numero;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la tabla
		double tabla[]=new double[5];
		//Creamos el for que se repetira cinco veces
		for(int i=0;i<tabla.length;i++) {
			//Pedimos el numero
			System.out.println("Introduzca numero decimal");
			//Lo leemos
			numero=sc.nextDouble();
			//Lo guardamos en la tabla
			tabla[i] = numero;
		}
		//Fuera del bucle imprimimos los numeros en orden
		System.out.print(Arrays.toString(tabla));
		//Cerramos el escáner
		sc.close();
	}

}
