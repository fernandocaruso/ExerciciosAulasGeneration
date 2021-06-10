package encapsulamento;

public class TestaCarro2 {

	public static void main(String[] args) {
		
		Carro2 car = new Carro2();
		Carro2 car2 = new Carro2();
		
		car.setMarca("Fiat");
		car.setModelo("Palio");
		car.setCapacidadeCombustivel(45);
		car.setNumPassageiros(5);
		
		car2.setMarca("Volks");
		car2.setModelo("Fox");
		car2.setCapacidadeCombustivel(46);
		car2.setNumPassageiros(4);
		
		System.out.println("Marca: " + car.getMarca());
		System.out.println("Modelo: " + car.getModelo());
		System.out.println("Capacidade de Combustível: " + car.getCapacidadeCombustivel());
		System.out.println("Numero de Passageiros: " + car.getNumPassageiros());
		
		System.out.println();
		
		System.out.println("Marca: " + car2.getMarca());
		System.out.println("Modelo: " + car2.getModelo());
		System.out.println("Capacidade de Combustível: " + car2.getCapacidadeCombustivel());
		System.out.println("Numero de Passageiros: " + car2.getNumPassageiros());

	}

}
