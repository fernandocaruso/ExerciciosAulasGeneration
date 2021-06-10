package ExercíciosAula03;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		
		int numero;
		int par = 0;
		int impar = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o " + i + "º número");
			numero = ler.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			}
			
			if (numero % 2 == 1) {
				impar++;
			}
		}
		
		System.out.println("Foram digitados: " + par + " números pares!");
		System.out.println("Foram digitados: " + impar + " números impares!");
	}
}
		
		
		
		
	


