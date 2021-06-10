package Exercicios;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		
		
		System.out.println("Leia o ponto x1: ");
		x1 = entrada.nextFloat();
		
		System.out.println("Leia o ponto y1: ");
		y1 = entrada.nextFloat();
		
		System.out.println("Leia o ponto x2: ");
		x2 = entrada.nextFloat();
		
		System.out.println("Leia o ponto y1: ");
		y2 = entrada.nextFloat();
		
		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("A distância é: " + "%.2f", d);
		
		
		
		
		
				
		
		

	}

}
