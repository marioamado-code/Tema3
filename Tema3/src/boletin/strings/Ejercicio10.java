package boletin.strings;
import java.util.Scanner;

public class Ejercicio10 {

    public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        // Convertir el carácter a minúsculas para unificar la codificación
        char charMin = Character.toLowerCase(c);
        char resultado = charMin;

        // Buscar el carácter en el conjunto1
        for (int i = 0; i < conjunto1.length; i++) {
            if (conjunto1[i] == charMin) {
                // Encontrar el carácter correspondiente en conjunto2
                resultado = conjunto2[i];
                break;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición de los conjuntos
        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        // Leer la frase del usuario
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();
        StringBuilder fraseCodificada = new StringBuilder();

        // Codificar cada carácter de la frase
        for (char c : frase.toCharArray()) {
            fraseCodificada.append(codifica(conjunto1, conjunto2, c));
        }

        // Mostrar la frase original y la frase codificada
        System.out.println("Frase original: " + frase);
        System.out.println("Frase codificada: " + fraseCodificada.toString());

        scanner.close();
    }
}
