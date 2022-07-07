package util;

import java.util.Scanner;

/*Maior e Média: Faça um programa que leia 5 números e
informe o maior número e a média desses números.*/

//Resolução com (do while)

public class Maior_E_Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int maior = 0;
		int soma = 0;

		int count = 0;
		do {
			System.out.println("Digite o numero: ");
			numero = sc.nextInt();
			if (numero > maior)
				maior = numero;//Guarda o valor na variável maior se for maior
			soma = soma + numero;//Acumula os numero digitado
			count = count + 1;//faz oacrescimo ao contador

		} while (count < 5);//Faz o loop 5x

		System.out.println("O maior numero é: " + maior);
		System.out.println("A média dos numeros é: " + soma / 5);
	}

}
