package english;

import java.util.Scanner;
import java.util.Arrays;

public class exercise1 {

	public static void main(String[] args) {
		// We introduce the variable value and position
		int position;
		int value;
		// We introduce the bolean exit to exit of the loop
		boolean stay = true;
		// We introduce the array of the values
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			// Creamos el numero random
			int numero=0;
			// Lo guardamos en la tabla
			array[i] = numero;
		}
		// We introduce the scanner
		Scanner sc = new Scanner(System.in);
		// We introduce a while loop , that will act while the c is not used, so the
		// boolean is false
	while(stay==true) {
			// We introduce the string variable
			String letter = "";
			// We introduce the options in the console
			System.out.println("Introduce option, a: show the array, b: change a number, and c: exit");
			letter=sc.nextLine();
			// We introduce a switch where will be three options of the string variable
			
			switch (letter) {
			case "a" -> {
				// We print the complete array
				System.out.print(Arrays.toString(array));
			}
			case "b" -> {
				// We ask for a value
				System.out.println("Introduce value");
				value = sc.nextInt();
				// We ask for a position
				System.out.println("Introduce position");
				position = sc.nextInt();
				array[position] = value;
			}
			case "c" -> {
				// We finish the loop
				stay = false;
			}
			}
	}
			// We close the scanner
			sc.close();
		

	}

}
