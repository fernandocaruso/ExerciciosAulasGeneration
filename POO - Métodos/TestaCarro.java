package classe;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		Carro fusca = new Carro();
		
		ferrari.nome = "Ferrari";
		ferrari.marca = "Ferrari It�lia";
		ferrari.ano = 2010;
		
		ferrari.acelerar(200);
		
		System.out.println("Rubinho acelerou e a velocidade da ferrari � de: " + ferrari.velocidade + "km/h");
		
		ferrari.freiar(60);
		System.out.println("Rubinho pisou no freio e sua velocidade agora � de: " + ferrari.velocidade + "km/h");
		
		System.out.println();
		
		fusca.nome = "Herby";
		fusca.marca = "Volks";
		fusca.ano = 1963;
		
		fusca.acelerar(100);
		
		System.out.println("Herby, o meu fusca turbinado, atingiu: " + fusca.velocidade + "km/h");
		
		fusca.freiar(25);
		System.out.println("Fusc�o pisou no freio e sua velocidade agora � de: " + fusca.velocidade + "km/h");
		
		
		
		

	}

}
