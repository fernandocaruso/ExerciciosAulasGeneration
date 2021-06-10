package br.generation.poo;

public class TesteMetodoFora {

	
	public static String cont(int inicio, int fim) throws InterruptedException {
		
		String numeroString = " ";
		for(int c = inicio; c <= fim; c++) {
			Thread.sleep(1000);
			numeroString += c + " ";
			
			
								}
		
		return numeroString;
				
				
	}
	

	}


