package Exerc�ciosAula03;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		// psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		// era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
		// op��es
		// (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		// agressiva).
		// Pede-se para elaborar um sistema que permita ler os dados de 5
		// pessoas, calcule e mostre:
		// o n�mero de pessoas calmas;
		// o n�mero de mulheres nervosas;
		// o n�mero de homens agressivos;
		// o n�mero de outros calmos;
		// o n�mero de pessoas nervosas com mais de 40 anos;
		// o n�mero de pessoas calmas com menos de 18 anos.

		
		int temperamento = 0;
		int idade = 0, sexo = 0;
		int i = 0;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int outrosCalmos = 0;
		int pessoaNervosaMais40 = 0;
		int pessoaCalmaMenos18 = 0;
		int homensAgressivos = 0;

		Scanner ler = new Scanner(System.in);
		

		while (i <= 2) {

			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();

			System.out.println("Digite seu sexo: 1 = feminino, 2 = masculino e 3 = outros");
			sexo = ler.nextInt();
			
			System.out.println("Digite seu temperamento: 1 = calmo, 2 = nervoso, 3 = agressivo");
			temperamento = ler.nextInt();

			if (temperamento == 1) {
				pessoasCalmas++;
			}
			if (temperamento == 2 && sexo == 1) {
				mulheresNervosas++;
			}
			if (temperamento == 3 && sexo == 2) {
				homensAgressivos++;
			}
			if (sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			}
			if (idade >= 40 && temperamento == 2) {
				pessoaNervosaMais40++;
			}

			if (idade <= 18 && temperamento == 1) {
				pessoaCalmaMenos18++;
			}
			
			i++;
			
			}
		System.out.println("O n�mero de pessoas calmas �: " + pessoasCalmas);
		System.out.println("\nO n�mero de mulheres nervosas � de: " + mulheresNervosas);
		System.out.println("\nO n�mero de pessoas agressivas � de: " + homensAgressivos);
		System.out.println("\nO n�mero de outros calmos � de: " + outrosCalmos);
		System.out.println("\nO n�mero de pessoas nervosas com mais de 40 anos � de: " + pessoaNervosaMais40);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos � de: " + pessoaCalmaMenos18);
		
				}

	}
			

