package br.com.caruso.interfaces;

public class Cavalo extends AnimalSuper implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("o som do cavalo �: ihihihihi");
		
	}

	@Override
	public void dormir() {
		System.out.println("o cavalo quando dorme faz: poc�-brbrbrbrbr");
		
	}

	@Override
	public void pratoPreferido() {
		System.out.println("O prato preferido do cavalo �: um bif�o enorme");
		
	}
	

}
