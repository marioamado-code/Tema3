package boletincolecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		// Estructura para almacenar usuarios y contraseñas
		HashMap<String, String> usuarios = new HashMap<>(); // Clave: nombre de usuario, Valor: contraseña
		Scanner scanner = new Scanner(System.in); // Para leer la entrada del usuario
		int opcion; // Variable para almacenar la opción del menú seleccionada

		do {
			// Mostrar menú principal
			System.out.println("\nMenú:");
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("3. Salir");
			System.out.print("Elija una opción: ");
			opcion = scanner.nextInt(); // Leer la opción seleccionada
			scanner.nextLine(); // Consumir el salto de línea que queda pendiente

			switch (opcion) {
			case 1 -> { // Caso para registrar un nuevo usuario
				System.out.print("Ingrese un nombre de usuario: ");
				String nuevoUsuario = scanner.nextLine(); // Leer el nombre de usuario

				// Verificar si el usuario ya existe
				if (usuarios.containsKey(nuevoUsuario)) {
					System.out.println("El usuario ya está registrado.");
				} else {
					System.out.print("Ingrese una contraseña: ");
					String nuevaContrasena = scanner.nextLine(); // Leer la contraseña
					usuarios.put(nuevoUsuario, nuevaContrasena); // Registrar el nuevo usuario
					System.out.println("Usuario registrado con éxito.");
				}
			}

			case 2 -> { // Caso para realizar el login
				System.out.print("Ingrese su nombre de usuario: ");
				String usuario = scanner.nextLine(); // Leer el nombre de usuario
				System.out.print("Ingrese su contraseña: ");
				String contrasena = scanner.nextLine(); // Leer la contraseña

				boolean accesoPermitido = false; // Variable para controlar si el acceso fue exitoso
				int intentosRestantes = 3; // Número máximo de intentos permitidos

				// Ciclo para verificar el acceso con un máximo de 3 intentos
				while (intentosRestantes >= 0 && !accesoPermitido) {
					// Verificar si el usuario y la contraseña son correctos
					if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena)) {
						System.out.println("Ha accedido al área restringida.");
						accesoPermitido = true; // Cambiar el estado a acceso permitido
					} else {
						intentosRestantes--; // Reducir el número de intentos restantes
						if (intentosRestantes >= 0) {
							System.out.println("Usuario o contraseña incorrectos. Intentos restantes: " + intentosRestantes);
							System.out.print("Ingrese nuevamente su contraseña: ");
							contrasena = scanner.nextLine(); // Leer la nueva contraseña
						}
					}
				}

				// Si no se permitió el acceso después de agotar los intentos
				if (!accesoPermitido) {
					System.out.println("Lo siento, no tiene acceso al área restringida.");
				}
			}

			case 3 -> // Caso para salir del programa
				System.out.println("Saliendo del programa. ¡Hasta pronto!");

			default -> // Caso para manejar opciones inválidas
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
		} while (opcion != 3); // Repetir el menú mientras la opción seleccionada no sea salir

		// Cerrar el Scanner para liberar recursos
		scanner.close();
	}
}
