import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. */
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		int maior;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		
		
			if (n1 > n2 && n1 > n3) {
				maior = n1;
			System.out.println("O maior n�mero foi: " + maior); 
			
			
			}
			else if (n2 > n1 && n2 > n3) {
				
				maior = n2; 
				System.out.println("\nO maior n�mero foi: " + maior);  
				
				
			}
				
			else if (n3 > n1 && n3 > n2) {
				maior = n3;
				System.out.println("\nO maior n�mero foi: " + maior); 
				
				
			}	
			
			else {
				System.out.println("N�meros iguais!");
			
			}

			
			}
	        }

	
			

