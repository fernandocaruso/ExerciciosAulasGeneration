import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que receba três inteiros e diga qual deles é o maior. */
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		int maior;
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		
		
			if (n1 > n2 && n1 > n3) {
				maior = n1;
			System.out.println("O maior número foi: " + maior); 
			
			
			}
			else if (n2 > n1 && n2 > n3) {
				
				maior = n2; 
				System.out.println("\nO maior número foi: " + maior);  
				
				
			}
				
			else if (n3 > n1 && n3 > n2) {
				maior = n3;
				System.out.println("\nO maior número foi: " + maior); 
				
				
			}	
			
			else {
				System.out.println("Números iguais!");
			
			}

			
			}
	        }

	
			

