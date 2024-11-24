package boletin5;

		

		import java.util.Scanner;

		public class Ejercicio5 {
		    public static void main(String[] args) {
		    	//creamos el tamaño a considerar y la matriz
		    	int tam;
		    	int matriz[][];
		        Scanner scanner = new Scanner(System.in);

		        // Pedimos al usuario el tamaño de la matriz
		        System.out.print("Introduce el tamaño de la matriz (NxN): ");
		         tam = scanner.nextInt();

		        // rellenamos la matriz
		         matriz = new int[tam][tam];
		        System.out.println("Introduce los elementos de la matriz:");
		        for (int i = 0; i < tam; i++) {
		            for (int j = 0; j < tam; j++) {
		                System.out.print("Elemento [" + i + "][" + j + "]: ");
		                matriz[i][j] = scanner.nextInt();
		            }
		        }

		        // Mostramos la matriz original
		        System.out.println("Matriz original:");
		        imprimirMatriz(matriz);

		        // Rotamos la matriz 90 grados
		        int[][] matrizRotada = gira90(matriz);

		        // Mostramos la matriz rotada
		        System.out.println("Matriz rotada 90 grados:");
		        imprimirMatriz(matrizRotada);

		        scanner.close();
		    }
		    //creamos la función que rota la matriz
		    public static int[][] gira90(int[][] tablaInicio) {
		        int tam = tablaInicio.length;
		        int[][] tablaRotada = new int[tam][tam];

		        // Llenamos la tabla rotada girando 90 grados
		        for (int i = 0; i < tam; i++) {
		            for (int j = 0; j < tam; j++) {
		                tablaRotada[j][tam - 1 - i] = tablaInicio[i][j];
		            }
		        }

		        return tablaRotada;
		    }
		    //creamos otra función para imprimir las matrices
		    public static void imprimirMatriz(int[][] matriz) {
		        for (int[] fila : matriz) {
		            for (int elemento : fila) {
		                System.out.print(elemento + " ");
		            }
		            System.out.println();
		        }
		    }
		}
