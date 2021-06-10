import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		/*Faça um programa que entre com três números e coloque em ordem crescente.*/
		
			
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		if (n1 < n2) {
			if(n2 < n3) {
				System.out.println(n1 + "-" + n2 + "-" + n3);
			} else if(n1 < n3) {
				System.out.println(n1 + "-" + n3 + "-" + n2);
			} else {
				System.out.println(n3 + "-" + n1 + "-" + n2);
				
			}
		}
			else if (n2 < n3) {
				if (n1 < n3) {
					System.out.println(n2 + "-" + n1 + "-" + n3);
				} 
				else {
						System.out.println(n2 + "-" + n3 + "-" + n1);
				}
				
			} else {
				System.out.println(n3 + "-" + n2+ "-" + n1);
			}
			
		}
		
	}
	

