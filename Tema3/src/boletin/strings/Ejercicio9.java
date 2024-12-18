package boletin.strings;
import java.util.Scanner;
public class Ejercicio9 {

	
		

		
		

		    public static boolean esIdiomaJavalandia(String frase) {
		        return frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len");
		    }

		    public static String extraerMensaje(String frase) {
		        String mensaje = frase;

		        if (frase.startsWith("Javalín, javalón")) {
		            // Eliminar la muletilla inicial y los espacios/tabuladores siguientes
		            mensaje = mensaje.substring(16).trim();
		        }

		        if (frase.endsWith("javalén, len, len")) {
		            // Eliminar la muletilla final y los espacios/tabuladores anteriores
		            mensaje = mensaje.substring(0, mensaje.length() - 16).trim();
		        }

		        return mensaje;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Leer la frase del usuario
		        System.out.println("Introduce una frase:");
		        String frase = scanner.nextLine();

		        // Comprobar si la frase está en el idioma de Javalandia
		        if (esIdiomaJavalandia(frase)) {
		            // Extraer y mostrar el mensaje sin muletillas
		            String mensaje = extraerMensaje(frase);
		            System.out.println("Mensaje sin muletillas: " + mensaje);
		        } else {
		            System.out.println("La frase no está en el idioma de Javalandia.");
		        }

		        scanner.close();
		    }
		

	}


