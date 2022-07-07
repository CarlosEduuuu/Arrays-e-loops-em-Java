package util;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e 
continue pedindo até que o usuário informe um valor válido.*/

//Resolução usando while

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;

		System.out.println("Digite a nota entre 0 a 10: ");
		nota = sc.nextInt();//Pega o valor digitado

		while (nota < 0 || nota > 10) {//Fica no laço enquanto a nota for válida
			System.out.println("Nota inválida!, Digite a nota novamente: ");
			nota = sc.nextInt();
		}
		System.out.println("A nota digitada foi: " + nota);
	}

}
