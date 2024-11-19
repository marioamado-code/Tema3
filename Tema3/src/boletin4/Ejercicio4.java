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

		System.out.println("Introduzca numero clave");

		clave = sc.nextInt();

	 resultado=buscar(t,clave);
		
	 if(resultado!=-1) {
		 System.out.println("La clave se encuentra en la posición: " + resultado); 
	 }else {
		 System.out.println("La clave no se encuentra en el array.");
	 }
	// Cerramos el escaner
				sc.close();
	 }
	

	
	
static int buscar(int t[], int clave) {
	int num=-1;
	
	for(int i=0;i<t.length;i++) {
		
	
	if(clave==t[i]) {
		num=i;
		break;
	}
		
		
	
	
	
}
	return num;
}
}
