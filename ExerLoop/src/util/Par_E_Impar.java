package util;

import java.util.Scanner;

/*Par e �mpar: Fa�a um programa que pe�a N n�meros inteiros.
Calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros impares.*/

//Resolu��o com (do while)

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
		} while (count < qtd);//Executa at� que condi��o seja satisfeita
		
		System.out.println("Quantidade de Pares: " + qtdPares);
		System.out.println("Quantidade de Pares: " + qtdImpares);
	}

}
