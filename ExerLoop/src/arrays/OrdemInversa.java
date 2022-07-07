package arrays;

import java.util.Scanner;

/*Ordem Inversa: Fa�a um Programa que leia um vetor de 5 n�meros inteiros 
e mostre-os na ordem inversa.*/

public class OrdemInversa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vect = { 1, -3, 5, 10, 45 };// Declara��o do vetor
		int count = 0;// Contador
		System.out.println("Tamanho do vetor: " + vect.length);// Exibe o tamanho do vetor
		System.out.print("Numeros na ordem original: ");
		while (count < vect.length) {// Enquanto contador menor que tamanho do vetor
			System.out.print(vect[count] + " ");// Imprime o vetor na ordem correta
			count++;// Acr�scimo no contador
		}
		System.out.println();//Quebra de linha
		System.out.print("Numeros na ordem inversa: ");
		for (int i = (vect.length - 1); i >= 0; i--) {//usa-se o -1 pois, o vetor come�a na posi��o 0
			System.out.print(vect[i] + " ");
		}
	}

}
