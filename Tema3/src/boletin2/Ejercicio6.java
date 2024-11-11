package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos la clase random
		Random rand = new Random();
		//Creamos un contador
		int cont=0;
		// Creamos la primera tabla
		int tabla1[] = new int[6];
		// Creamos la segunda tabla
		int tabla2[] = new int[6];
		// Rellenamos la tabla primera
		for (int i = 0; i < tabla1.length; i++) {
			// Creamos el numero random
			int numeroRandom = rand.nextInt(1, 50);
			// Lo guardamos en la tabla
			tabla1[i] = numeroRandom;

		}

		// Rellenamos la tabla segunda
		for (int i = 0; i < tabla2.length; i++) {
			// Creamos el numero random
			int numeroRandom = rand.nextInt(1, 50);
			// Lo guardamos en la tabla
			tabla2[i] = numeroRandom;
			//Vemos si es igual a alguno de la tabla 1 mediante un for y un if
			for(int j=0;j<tabla1.length;j++) {
				if(tabla1[j]==tabla2[i]) {
					cont++;
				}
			}

		}

		// Ordenamos la segunda tabla
		Arrays.sort(tabla2);
		//Imprimimos las dos tablas
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
		//Imprimimos los aciertos
		System.out.println(cont+" aciertos");
	}

}
