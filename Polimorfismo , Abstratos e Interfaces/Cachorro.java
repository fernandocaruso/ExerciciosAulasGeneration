package br.com.caruso.interfaces;

public class Cachorro extends AnimalSuper implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("O som do cachorro... auau");
		
	}

	@Override
	public void dormir() {
		System.out.println("O cachorro quando dorme: ronca");
		
		
		
	}

	@Override
	public void pratoPreferido() {
		System.out.println("O prato preferido do cachorro é: osso e pão francês");
		
	}
	
	

}
