package util;

import java.util.Scanner;

/*Maior e M�dia: Fa�a um programa que leia 5 n�meros e
informe o maior n�mero e a m�dia desses n�meros.*/

//Resolu��o com (do while)

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
				maior = numero;//Guarda o valor na vari�vel maior se for maior
			soma = soma + numero;//Acumula os numero digitado
			count = count + 1;//faz oacrescimo ao contador

		} while (count < 5);//Faz o loop 5x

		System.out.println("O maior numero �: " + maior);
		System.out.println("A m�dia dos numeros �: " + soma / 5);
	}

}
