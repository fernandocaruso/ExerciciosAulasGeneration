package classe;

public class TestaAluno {

	public static void main(String[] args) {
		
		
		//Instanciar(criar) o objeto Aluno (Criar um objeto Aluno)
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		//declarar valores espec�ficos para o objeto aluno1
		aluno1.nome = "Caruso";
		aluno1.curso = "Bootcamp Java Jr.";
		aluno1.idade = 26;
		
		//declarar valores espec�ficos para o objeto aluno2
		aluno2.nome = "Madalena";
		aluno2.curso = "Tet�";
		aluno2.idade = 1;
			
		
		// chamar os m�todos (da classe Aluno.java)
		
		aluno1.assistirAula();
		aluno1.fazerProva();
		aluno1.calcularNota();
		
		//Imprimindo o nome do objeto aluno1
		System.out.println(aluno1.nome);
		//Imprimindo o curso do objeto aluno1
		System.out.println(aluno1.curso);
		//Imprimindo a idade do objeto aluno1
		System.out.println(aluno1.idade + " anos");
		
		System.out.println();
		
		//Imprimindo o nome do objeto aluno2
		System.out.println(aluno2.nome);
		//Imprimindo o curso do objeto aluno2
		System.out.println(aluno2.curso);
		//Imprimindo a idade do objeto aluno2
		System.out.println(aluno2.idade + " dia de vida");
		
	// toda classe tem atributos que s�o caracteristicas utilizadas pelo objeto.
	// m�todos que a��es que os objetos podem realizar.
		
		
	}

	
	
	
}
