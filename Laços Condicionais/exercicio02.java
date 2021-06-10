package Exercicios;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idadeDias; 
		int idadeSemanas; 
		int idadeMeses;
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt();
		
		idadeDias = idade * 365;
		idadeSemanas = idade * 48;
		idadeMeses = idade * 12;
		
		System.out.println("Sua idade em anos é: " + idade);
		System.out.println("Sua idade em meses é: " + idadeMeses);
		System.out.println("Sua idade em dias é: " + idadeDias);
		
		

	}

}
