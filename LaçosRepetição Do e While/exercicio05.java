package Exerc�ciosAula03;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// Crie um programa que leia um n�mero do teclado at� que encontre um
		// n�mero igual a zero. No final, mostre a soma dos n�meros
		// digitados.(DO...WHILE)
		
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		
		do {
			System.out.println("Escreva o primeiro n�mero: ");
			numero = ler.nextInt();
			
			soma += numero;
		}
			while (numero != 0);
			
			System.out.println("A soma dos n�meros �: " + soma);
				
				}
	
	}
	

		
