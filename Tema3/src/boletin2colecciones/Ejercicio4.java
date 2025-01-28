package boletin2colecciones;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion = "";
		String nombre = "";
		LinkedList<String> nombres = new LinkedList<>();
		boolean quedarse = true;
		int indice;

		do {
			System.out.println("1.Añadir nuevo nombre a la lista.\r\n" + "2.Elimina un nombre específico.\r\n"
					+ "3.Ordena la lista alfabéticamente.\r\n" + "4.Busca si un nombre específico está en la lista.\r\n"
					+ "5.Salir.\r\n" + "");
			opcion = sc.nextLine();
			switch (opcion.charAt(0)) {
			case '1' -> {
				System.out.println("Introduce nombre");
				nombre = sc.nextLine();
				nombres.add(nombre);
			}
			case '2' -> {
				System.out.println("Introduzca nombre");
				nombre = sc.nextLine();
				indice = nombres.indexOf(nombre);
				if(indice>=0) {
				nombres.remove(indice);
				}else {
					System.out.println("Nombre introducido no está");
				}
			}
			case '3' -> {
				Collections.sort(nombres);
			}
			case '4' -> {
				System.out.println("Introduzca nombre");
				nombre = sc.nextLine();
				if (nombres.indexOf(nombre) >= 0) {
					System.out.println(nombre + " está en la lista");
				} else {
					System.out.println(nombre + " no está en la lista");
				}
			}
			case '5' -> {
				quedarse = false;
			}

			}
		} while (quedarse);
		sc.close();
	}

}
