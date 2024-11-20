package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos la tabla t

		int t[] = { 12, 11, 13, 14, 2, 6 };
		
		// creamos la variable suma de n numeros
		
		// creamos la variable n numeros
		int salto;
		
		int suma = 0;
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// pedimos de cuanto será la agrupación
		System.out.println("de cuanto será la agrupación");
		// Lo leemos
		salto = sc.nextInt();
		int tf[] = new int[t.length-(salto-1)];
		// Hacemos un for para ir pasando de conjunto en conjunto
		for (int h = 0; h < t.length;h++) {
		while(h<=salto+(1*h)) {
			suma+=t[h];
		}
		System.out.println(suma);	
		}

		// Imprimimos la tabla
		System.out.print(Arrays.toString(tf));
		sc.close();
	}

}
