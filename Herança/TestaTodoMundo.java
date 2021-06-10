package br.generation.heranca;


import aluno.Aluno;
import br.com.generation.heranca.funcionario.Professor;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Caruso");
		aluno1.setIdade(26);
		aluno1.setEndereço("Rua: José Gomes de Almeida, 500");
		aluno1.setCurso("Desenvolvedor Java JR");
		aluno1.setSemestre("Primeiro");
		aluno1.setAltura("1,87");
	
		
		prof1.setNome("Oziel");
		prof1.setIdade(30);
		prof1.setEndereço("Rua: Antonio do Campo, 152");
		prof1.setSalario(1400);
		prof1.setValeTransporte(500);
	
		
		System.out.println("== DADOS COLABORADOR - PROFESSOR ==");
		System.out.println("\nNome: " + prof1.getNome() 
		+ "\nIdade: " + prof1.getIdade() 
		+ "\nEndereço: " + prof1.getEndereço()
		+ "\nSalário: R$" + prof1.getSalario()
		+ "\nVale Transporte: R$" + prof1.getValeTransporte());
		
		System.out.println();
		System.out.println("•••••••••••••••••••••••••••••••••••••••••••••");
		System.out.println();
		System.out.println("== DADOS ESTUDANTE - ALUNO ==");
		System.out.println("\nNome: " + aluno1.getNome()
		+ "\nIdade: " + aluno1.getIdade()
		+ "\nEndereço: " + aluno1.getEndereço()
		+ "\nCurso: " + aluno1.getCurso()
		+ "\nSemestre: " + aluno1.getSemestre()
		+ "\nA altura do aluno é de: " + aluno1.getAltura());
		
		

	}

}
