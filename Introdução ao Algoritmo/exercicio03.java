import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto */

		
	
	{
			Scanner ler = new Scanner(System.in);
	
			int idade;
			
			System.out.println("Digite sua idade: ");
				idade = ler.nextInt();
			
			if (idade >= 5 && idade <= 7) {
				System.out.println("Você faz parte da categoria infantil A!"); 
								
											}
			
					else {
						if (idade >= 8 && idade <= 11) {
					System.out.println("Você faz parte da categoria infantil B!"); 
														}
												
					else {
						if (idade >= 12 && idade <= 13) {
							System.out.println("Você faz parte da categoria Juvenil A!");
														} 
														
					 else {
						if (idade >= 14 && idade <= 17) {
								System.out.println("Você faz parte da categoria Juvenil B!");
														}
						
					else {
						if (idade >= 18) {
									System.out.println("Você é adulto!");
										}
						
										}
							
					 	}
						}
						}
			}
							}	
}


					