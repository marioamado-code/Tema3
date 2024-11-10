package boletin2;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio1 {

	public static void main(String[] args) {
		//Introducimos la variable tamaño
		int tam;
		//Introducimos la variable valor
		float valor;
		//Creamos la tabla 
		int tabla[];
		//Creamos el escaner
		Scanner sc=new Scanner(System.in);
		//Pedimos al usuario el valor
		System.out.println("introduzca valor");
		valor=sc.nextFloat();
		//pedimos el tamaño
		System.out.println("introduzca tamaño");
		tam=sc.nextInt();
		//Le damos a la tabla el tamaño
		tabla=new int[tam];
		//Le damos a toda la tabla el mismo valor
		Arrays.fill(tabla,(int)valor);
		//lo mostramos
		System.out.print(Arrays.toString(tabla));
		//Cerramos el escaner
		sc.close();
	}

}
