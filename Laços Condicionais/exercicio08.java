package Exercicios;

import java.util.Scanner;

public class exercicio08 {


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double custofabrica = 0.0, custoconsumidor = 0.0;
		double distribuidor = 0;
		
		System.out.println("Qual o custo de fábrica do carro?");
		custofabrica = entrada.nextDouble();
		
		distribuidor = custofabrica + (0.28 * custofabrica);
		custoconsumidor = distribuidor + (0.45 * distribuidor);
		
		
		System.out.printf("O custo do carro novo pro consumidor é de R$: " + (Math.round(custoconsumidor)));
		
		
		
		
		
	}

}
