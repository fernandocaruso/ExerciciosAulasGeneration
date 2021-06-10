
public class exercicio01 {

	public static void main(String[] args) {
		// Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
		// O programa deve executar os seguintes passos: 
		// (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		// (b) Armazene em uma variável inteira (simples) 
		// a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		// (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
		// (d) Mostre na tela cada valor do vetor A, um em cada linha.
		
		double[] vetorA = new double[6];
		
		
		//a)
		vetorA[0] = 1;
		vetorA[1] = 0;
		vetorA[2] = 5;
		vetorA[3] = -2;
		vetorA[4] = -5;
		vetorA[5] = 7;
		int soma = 0;
		double valor = 0;
		int mais = 105;
		
		soma += vetorA[0] + vetorA[1] + vetorA[5];
		mais += valor = vetorA[4];

		
		//b)
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " - " + vetorA[i]);
				
			}
			
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado quarta posição: " + mais);
			
		}
		
		
		
		
		


	}


