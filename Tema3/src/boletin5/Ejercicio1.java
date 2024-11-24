package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos la tabla con sus propiedades
		int tabla[][] = new int[6][10];
		// Creamos la clase random
		Random rand = new Random();
		// Rellenamos la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// Generamos el numero random
				int num = rand.nextInt(0, 1001);
				tabla[i][j] = num;
				// imprimimos para que se pueda ver
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		//separamos las tablas
		System.out.println();
		//llamamos a la función
		int miniTabla[]=extremos(tabla);
		//la imprimimos
		System.out.print(Arrays.toString(miniTabla));

	}

	// Creamos la función que viene de la tabla bidimensional
	static int[] extremos(int tabla[][]) {
		// Creamos la tabla de los dos resultados
		int resultado[] = new int[2];
		// Ponemos dos numeros como inicio que sabemos que es muy improbable que acaben
		// como maximos o como minimos
		resultado[0] = 500;
		resultado[1] = 500;

		// Creamos un for para ver el numero maximo y colocarlo en la posición 1 de la
		// tabla resultado
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				//Si el numero de dicha posición es menor que los dos este pasa a ser el menor
				if (tabla[i][j] < resultado[1] && tabla[i][j] < resultado[0]) {
					resultado[0] = tabla[i][j];
					//si es mayor que los dos pasa a ser el mayor
				} else if (tabla[i][j] > resultado[1]) {
					resultado[1] = tabla[i][j];
				}

			}

		}

		// lo devolvemos
		return resultado;
	}
}
