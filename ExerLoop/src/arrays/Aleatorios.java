package arrays;

import java.util.Random;

/*N�meros Aleat�rios: Fa�a um Programa que leia 20 n�meros inteiros aleat�rios
(entre 0 e 100) armazene-os num vetor. Ao final, 
mostre os n�meros e seus sucessores.*/


//Resolvido com Random, for e foreach
public class Aleatorios {

	public static void main(String[] args) {
		Random random = new Random();

		int[] numerosAleatorios = new int[20];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		System.out.println("Numeros aleat�rios: ");
		for (int i : numerosAleatorios) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Numeros antecessores dos aleat�rios: ");
		for (int i : numerosAleatorios) {
			System.out.print((i - 1 )+ " ");
		}
		System.out.println();
		System.out.println("Numeros sucessores dos aleat�rios: ");
		for (int i : numerosAleatorios) {
			System.out.print((i + 1 )+ " ");
		}
	}

}
