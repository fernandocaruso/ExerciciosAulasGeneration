package Exercicios;

import java.util.Scanner;

public class exercicio05 {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n1, n2, n3, media;
		
		System.out.println("Vamos saber sua média escolar!");
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextFloat();
		
		media = (n1 * 2 + n2 * 3 + n3 * 5);
		System.out.println("Média final: " + media / 10);
		
		

	}

}
