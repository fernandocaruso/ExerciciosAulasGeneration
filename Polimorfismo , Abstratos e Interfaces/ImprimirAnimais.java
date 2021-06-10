package br.com.caruso.interfaces;

public class ImprimirAnimais extends AnimalSuper {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		Gato zatanna = new Gato();
		Cavalo pedepano = new Cavalo();
		
		
		dog1.somAnimal();
		dog1.dormir();
		dog1.pratoPreferido();
		System.out.println("===========================================");
		
		zatanna.somAnimal();
		zatanna.dormir();
		zatanna.pratoPreferido();
		System.out.println("===========================================");

		pedepano.somAnimal();
		pedepano.dormir();
		pedepano.pratoPreferido();
		System.out.println("===========================================");
		
		dog1.setNome("Ruffus");
		System.out.println("O nome do meu cachorro �: " + dog1.getNome());
		dog1.setIdade("13 anos");
		System.out.println("A idade do meu cachorro �: " + dog1.getIdade());
		dog1.setApelido("Ruffinho");
		System.out.println("O apelido do meu cachorro �: " + dog1.getApelido());
		
		System.out.println("===========================================");
		
		zatanna.setNome("Zatanna");
		System.out.println("O nome do meu gato �: " + zatanna.getNome());
		zatanna.setIdade("8 meses");
		System.out.println("A idade do meu gato �: " + zatanna.getIdade());
		zatanna.setApelido("Manhosa");
		System.out.println("O apelido do meu gato �: " + zatanna.getApelido());
		
		System.out.println("===========================================");
		
		pedepano.setNome("Horse");
		System.out.println("O nome do meu cavalo �: " + pedepano.getNome());
		pedepano.setIdade("13 anos");
		System.out.println("A idade do meu cavalo �: " + pedepano.getIdade());
		pedepano.setApelido("Cavalinho");
		System.out.println("O apelido do meu cavalo �: " + pedepano.getApelido());
		
		
		
		
	}

}
