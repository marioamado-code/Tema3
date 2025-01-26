package boletincolecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio9 {
    public static void main(String[] args) {
        // TreeMap para almacenar las estadísticas de los números y las estrellas
        TreeMap<Integer, Integer> numeros = new TreeMap<>();
        TreeMap<Integer, Integer> estrellas = new TreeMap<>();
        
        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable booleana para controlar si el programa continúa ejecutándose
        boolean continuar = true;

        while (continuar) {
            // Registrar los números principales (5 entre 1 y 50)
            registrarNumeros(scanner, numeros, 5, 1, 50, "números");
            
            // Registrar las estrellas (2 entre 1 y 12)
            registrarNumeros(scanner, estrellas, 2, 1, 12, "estrellas");

            // Mostrar estadísticas de los números y las estrellas
            mostrarEstadisticas(numeros, "Números");
            mostrarEstadisticas(estrellas, "Estrellas");

            // Preguntar al usuario si desea continuar
            System.out.println("¿Quieres registrar otro sorteo? (s/n):");
            continuar = scanner.next().equalsIgnoreCase("s"); // Actualizar la variable continuar
        }

        // Mensaje final del programa
        System.out.println("Programa finalizado.");
        
        // Cerrar el Scanner
        scanner.close();
    }

    // Método para registrar números o estrellas en el TreeMap
    static void registrarNumeros(Scanner scanner, TreeMap<Integer, Integer> mapa, int cantidad, int min, int max, String tipo) {
        System.out.println("Introduce " + cantidad + " " + tipo + " (entre " + min + " y " + max + "):");

        // Ciclo para registrar la cantidad requerida de números
        for (int i = 0; i < cantidad; i++) {
            int numero = scanner.nextInt(); // Leer el número ingresado por el usuario

            // Validar que el número esté dentro del rango permitido
            if (numero >= min && numero <= max) {
                // Incrementar la frecuencia del número en el mapa
                mapa.put(numero, mapa.getOrDefault(numero, 0) + 1);
            } else {
                // Si el número está fuera del rango, pedir al usuario que lo intente de nuevo
                System.out.println("Número fuera de rango. Inténtalo de nuevo:");
                i--; // Disminuir el índice para repetir esta iteración
            }
        }
    }

    // Método para mostrar las estadísticas de los números o estrellas
    static void mostrarEstadisticas(TreeMap<Integer, Integer> mapa, String titulo) {
        System.out.println("\n" + titulo + ":"); // Título de las estadísticas

        // Recorrer el mapa y mostrar cada número junto con la cantidad de veces que ha sido registrado
        mapa.forEach((num, count) -> System.out.println(num + ": " + count + " veces"));
    }
}
