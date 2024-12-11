package boletin.strings;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// introducimos la variable string cadena
		String cadena;

		// pedimos la frase y la leemos
		System.out.println("Introduzca frase");
		cadena = sc.nextLine();
		// llamamos a la función y la imprimimos
		String inversa = invertirCadena(cadena);
		System.out.println(inversa);
		// cerramos el escáner
		sc.close();

	}

	// creamos la función para invertir la cadena
	static String invertirCadena(String frase) {

//iniciamos la cadena inversa

		String invertida = "";
//empezamos el for en el final de la frase original
		for (int i = frase.length() - 1; i >= 0; i--) {
			// vamos añadiendo desde el inicio una letra
			invertida += frase.charAt(i);
		}

//devolvemos la cadena
		return invertida;
	}
}
