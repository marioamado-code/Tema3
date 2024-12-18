package boletin.strings;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos la variable frase
		String frase = "";
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// pedimos la frase
		System.out.println("Introduzca frase");
		frase = sc.nextLine();

		if (esPalindroma(frase)) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("La frase no es palíndroma");
		}
		// cerramos el escaner
		sc.close();
	}

	// Creamos la función para ver si es palíndroma
	static boolean esPalindroma(String frase) {
		boolean estado = true;
		// iniciamos la cadena inversa

		String invertida = "";
		// empezamos el for en el final de la frase original
		for (int i = frase.length() - 1; i >= 0; i--) {
			// vamos añadiendo desde el inicio una letra
			invertida += frase.charAt(i);
		}
		if (frase.equals(invertida)) {
			estado = true;
		} else {
			estado = false;
		}
		return estado;
	}
}
