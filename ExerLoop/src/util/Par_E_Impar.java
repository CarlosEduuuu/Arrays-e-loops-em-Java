package util;

import java.util.Scanner;

/*Par e Ímpar: Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade de números impares.*/

//Resolução com (do while)

public class Par_E_Impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int qtd;
		int qtdPares = 0;//Acumula a quantidade de Pares
		int qtdImpares = 0;//Acumula a quantidade de Impares

		System.out.println("Digite a quantidade de numeros: ");
		qtd = sc.nextInt();//Pega quantos numeros deseja verificar

		int count = 0;//inicializa o contador
		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			if (numero % 2 == 0) {//Verifica se par
				qtdPares = qtdPares + 1;
			} else
				qtdImpares = qtdImpares + 1;
			count++;
		} while (count < qtd);//Executa até que condição seja satisfeita
		
		System.out.println("Quantidade de Pares: " + qtdPares);
		System.out.println("Quantidade de Pares: " + qtdImpares);
	}

}
