package br.sobrecarga;

public class TestaSobrecargaMetodos {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println("Somando dois inteiros: " + calc.soma(20, 40));
		
		System.out.println("Somando dois Fracion�rios: " + calc.soma(56.36, 95.25));

		System.out.println("Somando os tr�s Inteiros: " + calc.soma(1, 2, 3));
	}

}
