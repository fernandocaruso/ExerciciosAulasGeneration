package Exercicios;

import java.util.Scanner;

public class exercicio07 {


		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			float a, b, c, d, E, f, g, x, y;
			
			System.out.println("Digite o valor de a: ");
			a = entrada.nextFloat();
			
			System.out.println("Digite o valor de b: ");
			b = entrada.nextFloat();
			
			System.out.println("Digite o valor de c: ");
			c = entrada.nextFloat();
			
			System.out.println("Digite o valor de d: ");
			d = entrada.nextFloat();
			
			System.out.println("Digite o valor de E: ");
			E = entrada.nextFloat();
			
			System.out.println("Digite o valor de f: ");
			f = entrada.nextFloat();
			
			x = ((c*E) - (b*f)) / ((a*E) - (b*d));
			y = ((a*f) - (c*d)) / ((a*E) - (b*d));
			
			System.out.println("Valor de X é igual a: " + x);
			System.out.println("Valor de y é igual a: " + y);

}
}