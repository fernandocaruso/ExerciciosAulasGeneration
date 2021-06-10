package br.com.caruso.interfaces;

public class Gato extends AnimalSuper implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("O som do gato é: miau");
		
	}

	@Override
	public void dormir() {
		System.out.println("o gato quando dorme: ronrona");
		
	}

	@Override
	public void pratoPreferido() {
		System.out.println("o prato preferido do gato é: qualquer comida que o dono tiver comendo.");
		
	}


	}
	
	


