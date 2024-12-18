package boletin.strings;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);

		        // Leer la frase del usuario
		        System.out.println("Introduce una frase:");
		        String frase = scanner.nextLine();

		        // Dividir la frase en palabras utilizando espacios como delimitadores
		        String[] palabras = frase.split(" ");

		        // Ordenar las palabras alfabéticamente
		        Arrays.sort(palabras);

		        // Mostrar las palabras ordenadas
		        System.out.println("Palabras ordenadas alfabéticamente:");
		        for (String palabra : palabras) {
		            System.out.println(palabra);
		        }

		        scanner.close();
		    }
		


	}


