package util;

/*Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120*/


//Resolução com for

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int fatorial = 1;
		int numero;
		
		System.out.println("Digite o numero para fatorial: ");
		numero = sc.nextInt();//

		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;//formula fatorial
		}
		System.out.println("O fatorial de " + numero + " é " + fatorial);
	}

}
