package boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos la tabla
		int tabla[][]=new int[10][10];
		//Creamos un for para las filas que sera una tabla de multiplicar
		for (int i = 0; i < tabla.length; i++) {
			// Creamos el for de las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				//Imprimimos la parte de la tabla indicada
				System.out.print((i+1)+"x"+(j+1)+"="+((i+1)*(j+1))+" ");
			}
			System.out.println();
		}
	}

}
