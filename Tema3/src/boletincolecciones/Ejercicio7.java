package boletincolecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Crear un TreeMap para almacenar las traducciones con insensibilidad a mayúsculas/minúsculas
        TreeMap<String, String> diccionario = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        
        // Añadir algunas palabras iniciales (en minúsculas para la comparación insensible a mayúsculas/minúsculas)
        diccionario.put("casa", "House");
        diccionario.put("perro", "Dog");
        diccionario.put("gato", "Cat");
        diccionario.put("libro", "Book");
        diccionario.put("mesa", "Table");
        diccionario.put("ventana", "Window");
        diccionario.put("silla", "Chair");
        diccionario.put("comida", "Food");
        diccionario.put("agua", "Water");
        diccionario.put("amigo", "Friend");
        diccionario.put("día", "Day");
        diccionario.put("noche", "Night");
        diccionario.put("sol", "Sun");
        diccionario.put("luna", "Moon");
        diccionario.put("árbol", "Tree");
        diccionario.put("cielo", "Sky");
        diccionario.put("mar", "Sea");
        diccionario.put("montaña", "Mountain");
        diccionario.put("ciudad", "City");
        diccionario.put("país", "Country");

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            // Mostrar el menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Insertar palabra");
            System.out.println("2. Buscar palabra");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1 -> { // Insertar palabra
                    System.out.print("Ingrese la palabra en español: ");
                    String espanol = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
                    System.out.print("Ingrese la traducción en inglés: ");
                    String ingles = scanner.nextLine();
                    // Convertir la primera letra a mayúsculas y el resto a minúsculas
                    ingles = ingles.substring(0, 1).toUpperCase() + ingles.substring(1).toLowerCase();
                    diccionario.put(espanol, ingles);
                    System.out.println("Palabra insertada correctamente.");
                }
                case 2 -> { // Buscar palabra
                    System.out.print("Ingrese la palabra en español que desea buscar: ");
                    String palabraBusqueda = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
                    if (diccionario.containsKey(palabraBusqueda)) {
                        System.out.println("La traducción de '" + palabraBusqueda + "' es: " + diccionario.get(palabraBusqueda));
                    } else {
                        System.out.println("La palabra no se encuentra en el diccionario.");
                    }
                }
                case 0 -> { // Salir
                    System.out.println("Saliendo del programa...");
                }
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0); // Continuar hasta que el usuario seleccione la opción 0 (salir)

        scanner.close();
    }
}
