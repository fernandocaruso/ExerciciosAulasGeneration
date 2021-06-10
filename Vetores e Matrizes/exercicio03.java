import java.util.Scanner;

public class exercicio03 {
	
	//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] matrizA = new int[3][3];
		int[][] maior10 = new int[3][3];
		
		for(int L = 0; L < 3; L ++) {
			for (int C = 0; C < 3; C++) {
				System.out.printf("Digite as notas: [%d][%d] ", (L+1), (C+1));
				matrizA[L][C] = entrada.nextInt();
				if (matrizA[L][C] > 10) {
					maior10[L][C] = matrizA[L][C];
								}
				
				
						}
			System.out.println();
		}

		for (int L = 0; L <3; L++) {
			for(int C = 0; C < 3; C++) {
				if (maior10[L][C] > 10) {
					System.out.println("[" + (L+1) + "]" + "[" + (C+1) + "] = " + maior10[L][C]);
				}
			}
		}
		
			}
		
		
	}


