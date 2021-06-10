package aluno;

import br.generation.heranca.Pessoa;
//necessário importar o pacote Pessoa por estar fora do pacote de aluno

public class Aluno extends Pessoa {
	
	private String semestre;
	private String curso;
	
	
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setIdade(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
