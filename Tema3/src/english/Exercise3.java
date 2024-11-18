package english;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// We introduce the table
		int table[][] = new int[10][10];
		// We introduce the random class
		Random rand = new Random();
		// We introduce a boolean to exit the loop
		boolean exit = false;
		boolean exitSmall = false;
		// We introduce the scanner
		Scanner sc = new Scanner(System.in);
		// We create a variable which is the position that the user give us
		int positionX;
		int positionY;
		// We create a variable who is where the fly is on the table
		int fly;
		// We create a number located in one row
		int numberRow = rand.nextInt(1, 11);
		// We create a number located in one column
		int numberColumn = rand.nextInt(1, 11);
		while (!exit) {
			if (exitSmall == false) {
				// We create a number located in one row
				 numberRow = rand.nextInt(1, 11);
				// We create a number located in one column
				numberColumn = rand.nextInt(1, 11);
			}
			// We create a for for the table to create a position of the fly
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					fly = table[numberRow][numberColumn];
				}
			}

			// We ask for a position

			System.out.println("Introduce position x");
			positionX = sc.nextInt();
			System.out.println("Introduce position y");
			positionY = sc.nextInt();

			// We compare the two positions
			if (numberRow == positionX && numberColumn == positionY) {

				System.out.println("You won");
				exit = true;
			} else if (numberRow - 1 == positionX || numberRow + 1 == positionX && numberColumn - 1 == positionY
					|| numberColumn + 1 == positionY) {
				System.out.println("You were near");
				exitSmall = false;

			}else {
				System.out.println("Far");
			}
		}
		sc.close();
	}

}
