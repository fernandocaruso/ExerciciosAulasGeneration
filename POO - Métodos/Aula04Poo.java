package br.generation.poo;

public class Aula04Poo {
	
	static int numero1 = 100;
	static int numero2 = 200;
	static int soma;

	public static void main(String[] args) throws InterruptedException {
		
		metodo();
		metodo2();
		metodo3();
		metodo4(500, 259);
		metodo5();

	}

	public static void metodo() {
		
		System.out.println("Eu sou um método!");
	}
	
	public static void metodo2() {
		
		soma = numero1 + numero2;
	}
	
	public static void metodo3() {
		
		System.out.println("Eu sou a soma dos números: " + soma);
	}
	
	public static void metodo4(int num1, int num2) {
		
		int subtracao = num1 - num2;
		System.out.println("Eu sou a subtração do método 4: " + subtracao);
	}
	
	public static void metodo5() throws InterruptedException {
		System.out.println("\nContando... Strings com FOR");
		System.out.println(TesteMetodoFora.cont(1, 10));
	}
	
}
