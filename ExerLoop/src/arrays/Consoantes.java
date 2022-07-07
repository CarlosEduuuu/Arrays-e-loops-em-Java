package arrays;

import java.util.Scanner;

/*Consoantes: Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas. Imprima as consoantes.
import java.util.Scanner;*/

//Resolvido com do while e for / com .equalsIgnoreCase

public class Consoantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] consoantes = new String[6];// Iniciando array vazio com 6 posições
		String [] vogais = new String[6];// Iniciando array vazio com 6 posições
		int count = 0;
		int qtdconsoantes = 0;
		int qtdVogal = 0;

		do {
			System.out.println("digite uma letra: ");
			String letra = sc.next();
			// Ignora as vogais
			if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
					| letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {
				// Guarda as consoantes no vetor
				consoantes[count] = letra;
				qtdconsoantes++; // Acréscimo no contador de consoantes
			} else
				vogais[count] = letra;//Guarda as vogais no vetor
			qtdVogal++;//Acréscimo no contador de vogais

			count++;//incremento no contador do do
		} while (count < consoantes.length);

		for (int i = 0; i < consoantes.length; i++) {
			if (consoantes[i] != null)//Verifica se o indice do vetor é diferente de nulo
				System.out.println("Consoante: " + consoantes[i] + " ");//Imprime 
		}
		for (int i = 0; i < vogais.length; i++) {
			if (vogais[i] != null)//Verifica se o indice do vetor é diferente de nulo
				System.out.println("Vogal " + vogais[i] + " ");//Imprime
		}

		System.out.println("Quantidade de consoantes: " + qtdconsoantes);
		System.out.println("Quantidade de Vogais: " + qtdVogal);

	}

}
