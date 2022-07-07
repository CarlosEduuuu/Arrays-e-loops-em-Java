package util;

import java.util.Scanner;

/*Fa�a um programa que pe�a uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inv�lido e 
continue pedindo at� que o usu�rio informe um valor v�lido.*/

//Resolu��o usando while

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;

		System.out.println("Digite a nota entre 0 a 10: ");
		nota = sc.nextInt();//Pega o valor digitado

		while (nota < 0 || nota > 10) {//Fica no la�o enquanto a nota for v�lida
			System.out.println("Nota inv�lida!, Digite a nota novamente: ");
			nota = sc.nextInt();
		}
		System.out.println("A nota digitada foi: " + nota);
	}

}
