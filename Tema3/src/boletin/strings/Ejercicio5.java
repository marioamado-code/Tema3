package boletin.strings;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//creamos la variable palabra
		String palabra;
		//creamos la variable frase donde almacenar las palabras
		String frase;
		//creamos el boolean para salir
		boolean quedarse=true;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		//hacemos el do while mientras la palabra no sea fin
		
			//pedimos al usuario una palabra
			System.out.println("Introduzca palabra");
			palabra= sc.nextLine();
		frase=palabra+"";
		
		while(quedarse) {
			frase+=palabra;
			frase+=" ";
			System.out.println("Introduzca palabra");
			palabra= sc.nextLine();
			if(palabra=="fin") {
			quedarse=false;	
			}
		}
		System.out.println(frase);
		
		sc.close();
	}

}
