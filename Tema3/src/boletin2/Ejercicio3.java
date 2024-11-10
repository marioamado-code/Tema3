package boletin2;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos la variable numero
		int num;
		// Creamos la clase random
		Random rand = new Random();
		// creamos la tabla
		int tabla[] = new int[30];
		//Hacemos el for donde se ira haciendo un numero aleatorio cada vez
		for(int i=0;i<tabla.length;i++) {
		 num = rand.nextInt(0, 10);
		 //Lo guardamos
		 tabla[i] = num;
		}
		//Ordenamos con un sort e imprimimos con un to string
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
	}

}
