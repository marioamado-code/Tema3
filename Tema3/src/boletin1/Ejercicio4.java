package boletin1;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la tabla
		int numeros[] = new int[12];
		// Inicializamos los valores
		numeros[0] = 39;
		numeros[1] = -2;
		numeros[4] = 0;
		numeros[6] = 14;
		numeros[8] = 5;
		numeros[9] = 120;
		// Imprimimos la tabla
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		// Comprobamos en la consola que se imprimen ceros cuando no se introduce nada
	}

}
