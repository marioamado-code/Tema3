package boletincolecciones;
//Aplicación de gestión de productos
//Programa para registrar, eliminar y listar productos con sus precios.

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
 public static void main(String[] args) {
     // Mapa para almacenar productos (nombre como clave, precio como valor)
     HashMap<String, Double> productos = new HashMap<>();
     Scanner scanner = new Scanner(System.in);
     int opcion;

     do {
         // Mostrar menú
         System.out.println("\nPRODUCTOS");
         System.out.println("1. Alta de producto");
         System.out.println("2. Baja de producto");
         System.out.println("4. Listar existencias");
         System.out.println("0. Salir");
         System.out.print("Selecciona una opción: ");

         opcion = scanner.nextInt();
         scanner.nextLine(); // Limpiar el buffer

         switch (opcion) {
             case 1->{
                 altaProducto(scanner, productos);
             }
             case 2->{
                 bajaProducto(scanner, productos);
             }
             case 4->{
                 listarProductos(productos);
             }
             case 0->{
                 System.out.println("Saliendo del programa...");
             }
             default->
                 System.out.println("Opción no válida. Inténtalo de nuevo.");
         }
     } while (opcion != 0);

     scanner.close(); // Cerrar el escáner
 }

 // Método para dar de alta un producto
  static void altaProducto(Scanner scanner, HashMap<String, Double> productos) {
     System.out.print("Introduce el nombre del producto: ");
     String nombre = scanner.nextLine();
     if (productos.containsKey(nombre)) {
         System.out.println("El producto ya existe.");
     } else {
         System.out.print("Introduce el precio del producto: ");
         double precio = scanner.nextDouble();
         productos.put(nombre, precio);
         System.out.println("Producto agregado correctamente.");
     }
 }

 // Método para dar de baja un producto
  static void bajaProducto(Scanner scanner, HashMap<String, Double> productos) {
     System.out.print("Introduce el nombre del producto a eliminar: ");
     String nombre = scanner.nextLine();
     if (productos.remove(nombre) != null) {
         System.out.println("Producto eliminado correctamente.");
     } else {
         System.out.println("El producto no existe.");
     }
 }

 // Método para listar todos los productos con sus precios
  static void listarProductos(HashMap<String, Double> productos) {
     if (productos.isEmpty()) {
         System.out.println("No hay productos registrados.");
     } else {
         System.out.println("\nListado de productos:");
         productos.forEach((nombre, precio) -> System.out.println(nombre + ": " + precio + " €"));
     }
 }
}

