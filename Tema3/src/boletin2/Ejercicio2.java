package boletin2;

import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio2 {

	public static void main(String[] args) {
		//Introducimos la variable numero
		int num;
		//Introducimos la primera tabla
		int tabla1[]=new int[10];
		//Introducimos la segunda tabla
		int tabla2[]=new int[10];
		//creamos el escaner
		Scanner sc=new Scanner(System.in);
		//Hacemos un for para la primera tabla
		for(int i=0;i<tabla1.length;i++) {
			System.out.println("Introduzca numero");
			num = sc.nextInt();
			// Lo guardamos en la tabla
			tabla1[i] = num;
		}
		
		//Hacemos un for para la segunda tabla
		for(int i=0;i<tabla2.length;i++) {
			System.out.println("Introduzca numero");
			num = sc.nextInt();
			// Lo guardamos en la tabla
			tabla2[i] = num;
		}
		//Comparamos los arrays y mostramos cada resultado
		if (Arrays.equals(tabla1,tabla2)==true) {
			System.out.println("Los arrays son iguales");
		}else{
			System.out.println("Los arrays no son iguales");
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
