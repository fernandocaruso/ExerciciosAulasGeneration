package Exerc�ciosAula03;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		// final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		// 0(zero).(DO...WHILE)

		Scanner ler = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		int media = 0;
		int contagem = 0;
		int resultado;
		
		
		do {
			
			System.out.println("Digite o primeiro n�mero: ");
			numero = ler.nextInt();
			
			resultado = numero % 3;
			
			if (resultado == 0) {
			soma = soma + numero;
			contagem++;
								}
			}
			
				while(numero != 0);
			
				media = soma / contagem;
		
							
		System.out.println("\nA m�dia dos n�meros m�ltiplos de 3 � de: " + media);
		
							}
										}	


