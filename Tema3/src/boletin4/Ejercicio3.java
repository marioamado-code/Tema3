package boletin4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Creamos la tabla y su tamaño
        int[] tabla;
        int tamaño;
        int max;

        // Creamos el escáner
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Pedimos al usuario el tamaño de la tabla
        System.out.println("¿Cuántos números tendrá la tabla?");
        tamaño = scanner.nextInt();

        // Pedimos al usuario el número máximo
        System.out.println("¿Cuál será el número máximo?");
        max = scanner.nextInt();

        // Inicializamos la tabla
        tabla = new int[tamaño];

        // Llamamos a la función para rellenar la tabla con números pares
        generarNumerosPares(tabla, max, rand);

        // Ordenamos la tabla
        Arrays.sort(tabla);

        // Imprimimos la tabla
        System.out.println(Arrays.toString(tabla));

        // Cerramos el escáner
        scanner.close();
    }

    // creamos la función para generar números pares y rellenar la tabla
     static void generarNumerosPares(int[] tabla, int max, Random rand) {
        for (int i = 0; i < tabla.length; i++) {
            int num = rand.nextInt(2, max + 1);
            while (num % 2 != 0) { // Verificamos que sea par
                num = rand.nextInt(2, max + 1);
            }
            tabla[i] = num;
        }
    }
}
