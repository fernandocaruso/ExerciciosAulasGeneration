package ExercíciosAula03;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99.

		int idade21 = 0;
		int idade50 = 0;
		int idade = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("[[Digite -99 para parar o programa!]]");
			
	
		
		if (idade >= 0 && idade < 21) {
			idade21++;
		               }
		
		else if (idade > 50) {
				idade50++;
		}
			
		
			System.out.println("Temos " + idade21 + " pessoas menores dos 21 anos!");
			System.out.println("Temos " + idade50 + " pessoas acima de 50 anos!");
			
		}
		
}
}



