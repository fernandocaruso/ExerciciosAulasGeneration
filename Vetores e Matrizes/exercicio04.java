import java.util.Scanner;

public class exercicio04 {
	/*Vetores e matrizes - Java: 4
	 /exercicio complexo, tive ajuda e orienta��o da Ana
	 /
	 /  Enunciado: 
	 4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor 
		da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.*/

	public static void main(String[] args) {
		
		double [][] m1 = new double[2][2];
		double [][] m2 = new double[2][2];
		double [][] mR = new double[2][2]; //matriz resultante para as opera��es das op��es (1) e (2)
		int usuario = 0; //essa vari�vel guarda a op��o que o usu�rio escolheu
		double constante; //essa vari�vel � a constante pedida na op��o (3)
		
		Scanner in = new Scanner(System.in);
		
		//Lendo a primeira matriz
		System.out.println("Digite a primeira matriz 2 x 2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m1[l][c] = in.nextDouble();
			}
		}
		
		//Lendo a segunda matriz
		System.out.println("\nDigite a segunda matriz 2x2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m2[l][c] = in.nextDouble();
			}
		}
		
		//Print do menuzinho de op��es
		System.out.println("==================================================================");
		System.out.println("Escolha uma das op��es abaixo: ");
		System.out.println("DIGITE 1 para somar as matrizes\nDIGITE 2 para subtrair primeira matriz da segunda"
				+ "\nDIGITE 3 para adicionar uma constante as duas matrizes\nDIGITE 4 para imprimir as matrizes");
		usuario = in.nextInt();
		
		System.out.println("==================================================================");
		
		
		//Dentro dos ifs, o programa executa a op��o e j� imprime pro usu�rio!
		
		//op��o 1: somar as matrizes
		if (usuario == 1) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m1[l][c] + m2[l][c];
				}
			}
			
			System.out.println("\nMatriz resultante da soma (m1 + m2): ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
		}
		
		//op��o 2: subtraindo as matrizes
		else if (usuario == 2) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m2[l][c] - m1[l][c];
				}
			}

			System.out.println("\nMatriz resultante da subtra��o (m2 - m1): ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
		}
		//op��o 3: adicionando uma constante
		else if (usuario == 3) {
			System.out.println("Digite a constante: ");
			constante = in.nextDouble();
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					m1[l][c] = m1[l][c] + constante;
					m2[l][c] = m2[l][c] + constante;
				}
			}
		}
	}
}

