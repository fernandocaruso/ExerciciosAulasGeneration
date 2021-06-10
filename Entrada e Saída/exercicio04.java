package Exercicios;

import java.util.Scanner;

public class exercicio04 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		int r = 0, s = 0, d;

		System.out.println("Digite o número A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o número B: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o número C: ");
		c = entrada.nextInt();
		
		r = (a+b) * (a+b);
		s = (b + c) * (b+c);
		d = (r + s) / 2;
		
		System.out.println("O resultado do cálculo é: " + d);
		
		
	}

}
