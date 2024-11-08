package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Introducimos la variable temperatura media del mes
		int temp;
		//Introducimos la variable mes
		int mes=1;
		// Introducimos la tabla meses
		int meses[] = new int[12];
		// Introducimos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Creamos el for guardando los numeros en la tabla
		for (int i = 0; i < meses.length; i++) {
			// Pedimos el numero
			System.out.println("Introduzca temperatura media del mes "+ mes);
			// Lo leemos
			temp = sc.nextInt();
			// Lo guardamos en la tabla
			meses[i] = temp;
			//Incrementamos el mes
			mes++;
		}
		//Volvemos a leer la tabla
		for (int i = 0; i < meses.length; i++) {
			
		//creamos un for para cada numero de la tabla, e imprimimos un asterisco por unidad
		for(int j=0;j<meses[i];j++) {
			System.out.print("*");
		}
		System.out.println();
		}
		//cerramos el escaner
		sc.close();
	}

}
