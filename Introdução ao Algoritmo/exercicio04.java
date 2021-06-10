import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
			número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
			ímpar exiba o número elevado ao quadrado.*/

		
	
	{
			Scanner ler = new Scanner(System.in);
	
			int numero;
			double raiz;
			double elevado;
			
			System.out.println("Digite um número inteiro: ");
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("O número é par!");
				raiz = Math.sqrt(numero);
				System.out.println("\nA raiz do " + numero + " é: " + raiz);
				
									}
			
			else if (numero % 2 == 1) {
				System.out.println("\nO número é ímpar!"); 
				elevado = Math.pow(numero, 2);
				System.out.println("\nA potencia² de " + numero + " é: " + elevado);
									}							
								}
							}		
						}
			
	

	
	