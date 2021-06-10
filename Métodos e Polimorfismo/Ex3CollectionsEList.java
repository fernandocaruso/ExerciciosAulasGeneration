package Exercicios;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
//trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
//programa dever� atender as seguintes funcionalidades:
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.


public class Ex3CollectionsEList {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String produto, rm;
		int numero;
		
		System.out.println("Quantos produtos voc� quer cadastrar?");
		numero = ler.nextInt();
		
		List<String> estoque = new ArrayList<>();
		
		for(int i = 1; i <= numero; i++) {
			System.out.println("Digite o produto: ");
			produto = ler.next();
			
			estoque.add(produto);
			
		}
		
		System.out.println("Lista: " + estoque);
		
		System.out.println("Gostaria de retirar algum produto? S para sim / N para n�o");
		rm = ler.next();

		if(rm.equals("S")) {
			System.out.println("Informe o c�digo do produto para ser removido: ");
			int rf = ler.nextInt();
			
			estoque.remove(rf);
			
		}
		
			System.out.println("Lista atualizada: " + estoque);
	

	}

}
