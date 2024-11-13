package boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Introducimos la tabla
		int num[][] = new int[3][6];
		// Inicializamos cada numero en la tabla
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// creamos un for para las filas
		for (int i = 0; i < num.length; i++) {
			// creamos un for para las columnas
			for (int j = 0; j < num[i].length; j++) {
				// Imprimimos la tabla
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}

}
