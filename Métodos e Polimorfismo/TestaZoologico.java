package Exercicios;


	import Exercicios.Animal;


	public class TestaZoologico {

	public static void main(String[] args) {

		//1)
		
		Animal animal1 = new Animal();
		Cachorro dog1 = new Cachorro();
		
		
		Animal animal2 = new Animal();
		Cavalo cavalinho = new Cavalo();
		
		Animal animal3 = new Animal();
		Preguiça nhaca = new Preguiça();
		
		
		animal1.setNome("Árthur");
		animal1.setIdade("11 anos");
		animal1.setQualSom("AuAuAu");
		animal1.setVelocidade("44 km/h");
		dog1.setApelido("Morceguinho!");
		dog1.setOssoPreferido("T-Bone");
		
		System.out.println("Meu cachorro " + animal1.getNome() + " tem " + animal1.getIdade()
		+ " e faz um barulho fofo de: " + animal1.getQualSom() + "!" + 
		"\nSeu osso preferido é o: " + dog1.getOssoPreferido() + " e ele é tão rápido que alcança: "
		+ animal1.getVelocidade() + "." + "\nSeu apelido carinhoso é: " + dog1.getApelido());
		
		System.out.println();
		
		animal2.setNome("Pé de Pano");
		animal2.setIdade("14 anos");
		animal2.setQualSom("iihihihr");
		animal2.setVelocidade("103 km/h");
		cavalinho.setCorrida("campeão de corrida");
		cavalinho.setVelocidadeMaxima(154);
		
		System.out.println("Meu cavalo " + animal2.getNome() + " tem " + animal2.getIdade()
		+ " e faz um barulhinho agudo quando tá feliz, parecido com " + animal2.getQualSom()
		+ "." + "\nCostuma correr a " + animal2.getVelocidade() + " porém é um verdadeiro " + cavalinho.getCorrida()
		+ " pois atinge uma velocidade incrível de " + cavalinho.getVelocidadeMaxima() + "km/h!");
		
		System.out.println();
		
		animal3.setNome("Caruso");
		animal3.setIdade("26 anos");
		animal3.setQualSom("grinhééé");
		animal3.setVelocidade("2,5 km/h");
		nhaca.setAlturaMaxima("2 metros");
		nhaca.setHorasDeSono("13 horas seguidas");
		
		
		System.out.println("Comprei uma preguiça chamada " + animal3.getNome()
		+ " de " + animal3.getIdade() + " que quando tá pistola faz " + animal3.getQualSom()
		+ "." + "\nTem a velocidade de " + animal3.getVelocidade()
		+ " e por ser bem lerdinho, alcança até " + nhaca.getAlturaMaxima() + " de altura numa árvore."
		+ "\nPode dormir por longos períodos, tendo um pico de " + nhaca.getHorasDeSono() + " de sono");
		
		
		System.out.println();
	
		//2)
	
		System.out.println("=== SOM DO CACHORRO ===");
		System.out.println(animal1.getQualSom());
	
		System.out.println();
	
		System.out.println("=== SOM DO CAVALO ===");
		System.out.println(animal2.getQualSom());
	
		System.out.println();
	
		System.out.println("=== SOM DA PREGUIÇA ===");
		System.out.println(animal3.getQualSom());
	
		
	}

}
