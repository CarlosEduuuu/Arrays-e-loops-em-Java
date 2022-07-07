package arrays;

import java.util.Random;

/*Array Multidimensional: Gere e imprima uma matriz M 4x4
com valores aleatórios entre 0-9. Após isso determine o menor número da matriz
e a sua posição (linha, coluna).*/

public class Multidimensional {

	public static void main(String[] args) {
		Random randon = new Random();

		int[][] matriz = new int[4][4];
		int menor = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = randon.nextInt(9);
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
//Primeira forma de exibir numeros
		/*
		  System.out.println("Matriz: ");
		   for (int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[i].length; j++) { 
		    System.out.print(matriz[i][j] + " ");		 
		  }
		 */

		System.out.println("menor: " + menor);
		
		System.out.println("Matriz: ");
		for (int[] linhaM : matriz) {
			for (int colunaM : linhaM) {
				System.out.print(colunaM + " ");
			}
			System.out.println();
		}

	}

}
