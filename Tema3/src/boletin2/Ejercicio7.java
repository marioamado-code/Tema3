package boletin2;
import java.util.Arrays;
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos la tabla
		int tabla[]=new int[55];
		//Utilizamos arrays.fill 10 veces
		Arrays.fill(tabla,0,0,1);
		Arrays.fill(tabla,1,2,2);
		Arrays.fill(tabla,3,5,3);
		Arrays.fill(tabla,6,9,4);
		Arrays.fill(tabla,10,14,5);
		Arrays.fill(tabla,15,20,6);
		Arrays.fill(tabla,21,27,7);
		Arrays.fill(tabla,28,35,8);
		Arrays.fill(tabla,36,44,9);
		Arrays.fill(tabla,45,54,10);
		// Imprimimos la tabla
		System.out.print(Arrays.toString(tabla));
	}

}
