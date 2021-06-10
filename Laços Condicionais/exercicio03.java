package Exercicios;

import java.util.Scanner;
import java.math.BigDecimal;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double totalSegundos;
		double totalHoras;
		double totalMinutos;
		double arredondadoMinutos;
		double arredondadoHora;
		
			System.out.println("Digite o tempo de duração em segundos: ");
			totalSegundos = entrada.nextInt();
			
			
			totalMinutos = (totalSegundos / 60);
			totalHoras = (totalMinutos / 60);
			
			double arredondarHora = Math.round(2);
			double arredondarMinutos = Math.round(2);
			
			
			
			
			
			System.out.println("Demorou em minutos: " + totalMinutos);
			System.out.println("Demorou em horas: " + totalHoras);
			
		
		
		

	}

}
