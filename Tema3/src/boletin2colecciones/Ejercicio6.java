package boletin2colecciones;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
        int opcion;
        boolean quedarse = true;
        String persona = "";
        String telefono;
        
        HashMap<String, ArrayList<String>> personas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1: Añadir persona.\r\n" + "2: Añadir teléfono a una persona dada.\r\n"
                    + "3: Mostrar los teléfonos de una persona.\r\n" + "4: Eliminar teléfono de una persona.\r\n"
                    + "5: Eliminar una persona.\r\n" + "6: salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
            case 1 -> {
                System.out.println("Introduce nombre de la persona");
                persona = sc.nextLine();
                personas.put(persona, new ArrayList<>());
            }
            case 2 -> {
                System.out.println("Introduce persona a la que vas a añadirle un teléfono");
                persona = sc.nextLine();
                if (personas.containsKey(persona)) {
                    System.out.println("Introduce teléfono");
                    telefono = sc.nextLine();
                    personas.get(persona).add(telefono);
                } else {
                    System.out.println(persona + " no está en la lista");
                }
            }
            case 3 -> {
                System.out.println("Introduce persona a la que ver sus teléfonos");
                persona = sc.nextLine();
                if (personas.containsKey(persona)) {
                    System.out.println("Los teléfonos son " + personas.get(persona));
                } else {
                    System.out.println(persona + " no está en la lista");
                }
            }
            case 4 -> {
                System.out.println("Introduce persona a la que eliminar un teléfono");
                persona = sc.nextLine();
                if (personas.containsKey(persona)) {
                    System.out.println("Los teléfonos son " + personas.get(persona));
                    System.out.println("¿Cuál eliminas? Pon el teléfono");
                    telefono = sc.nextLine();
                    if (personas.get(persona).remove(telefono)) {
                        System.out.println("Teléfono eliminado");
                    } else {
                        System.out.println("El teléfono no está en la lista");
                    }
                } else {
                    System.out.println(persona + " no está en la lista");
                }
            }
            case 5 -> {
                System.out.println("Introduce persona a la que eliminar");
                persona = sc.nextLine();
                if (personas.containsKey(persona)) {
                    personas.remove(persona);
                } else {
                    System.out.println(persona +" no está en la lista");
                }
            }
            case 6 -> {
                quedarse = false;
            }
            }
        } while (quedarse);

        sc.close();
    }
}
