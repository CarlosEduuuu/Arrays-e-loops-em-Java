package util;

/*Nome e Idade: Faça um programa que leia conjuntos de dois valores, 
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)*/

//Resolvendo com while
import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
        
		while (true){//Entra no laço {
		System.out.println("Digite o nome: ");
		nome = sc.next();
		if (nome.equals("0"))
			break;		//Se a condição for verdadeira sai do laço
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		}
		
		System.out.println("Finalizando!");//Exibe caso o usuário digite "0"
		}
	
		
		
	}


