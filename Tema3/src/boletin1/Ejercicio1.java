package boletin1;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos el escáner
		Scanner sc=new Scanner(System.in);
		//Creamos la clase random
		Random rand=new Random();
		
		//creamos la tabla
		int Tabla[]=new int[10];
		//Creamos el for para que se repita 10 veces
		for (int i=0;i<Tabla.length;i++) {
		//Creamos el numero random
		int numero= rand.nextInt(1,101);
		//Imprimimos ese numero
		System.out.print(numero+ " ");
	}
		//Cerramos el escáner
		sc.close();
	}

}
