package util;

import java.util.Scanner;

/*Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro
entre 1 a 10. O usu�rio deve informar de qual numero ele deseja ver a tabuada.
A sa�da deve ser conforme o exemplo abaixo:
	Tabuada de 5:
		5 X 1 = 5
		5 X 2 = 10
		...
		5 X 10 = 50*/

//Resolu��o com for

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite qual numero deseja ver a tabuada: ");
		numero = sc.nextInt();	
		System.out.println("Tabuada do: " + numero);
		for(int i=1; i<= numero; i++) {		
			System.out.println(numero + " x " + i + " = " + numero * i  );
		}
		
		

	}

}
