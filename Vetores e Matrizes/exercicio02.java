import java.util.Scanner;

public class exercicio02 {
	
	//Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	//� Os n�meros pares digitados;  
	//� A soma dos n�meros pares digitados; 
	//� Os n�meros �mpares digitados; 
	//� A quantidade de n�meros �mpares digitados.


	public static void main(String[] args) {
			
			int[] vetor = new int[6];
			
			int somapar = 0, quantimpar = 0;
			int somaimpar = 0;
			int[] vetorpar = new int[6];
			int[] vetorimpar = new int[6];
			
			Scanner entrada = new Scanner(System.in);
			
			for(int x = 0; x < 6; x++) {
				System.out.println("Entre com um valor: ");
				vetor[x] = entrada.nextInt();
				
				if(vetor[x]% 2 == 0 ) {
					vetorpar[x] = vetor[x];
					System.out.println("Valor Par: " + vetor[x]);
					somapar += vetor[x];
					
				}
				else {
					System.out.println("Valor Impar: " + vetor[x]);
					vetorimpar[x] = vetor[x];
					somaimpar += vetor[x];			
					quantimpar++;
				}
				}
			
				System.out.println();
			
				System.out.println("Soma de n�meros pares: " + somapar);
				System.out.println("Impares digitados: " + quantimpar);
				
				System.out.println();
				System.out.println();
				
				/*for (int x = 0; x < 6; x++ ) {
					if(vetor[x] %2 == 0) {
						System.out.printf("\nMatriz par:   %d " , vetor[x]);
						
					}
					
				}
				for (int x = 0; x < 6; x++ ) {
					if(vetor[x] %2 == 1) {
						System.out.printf("\nMatriz impar:   %d " , vetor[x]);
			
			}
				} */
				
				
				for (int x = 0; x < 6; x++) {
					System.out.println(vetorpar[x]);
					}
				for (int x = 0; x < 6; x++) {
					System.out.println(vetorimpar[x]);
					
				}
					
					
					
				
				
			}

	}


