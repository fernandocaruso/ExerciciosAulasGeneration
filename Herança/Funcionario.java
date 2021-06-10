package br.com.generation.heranca.funcionario;

import br.generation.heranca.Pessoa;
//necessário importar a classe Pessoa por estar fora do pacote de funcionario

public class Funcionario extends Pessoa {

	private double salario;
	private double valeTransporte;
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(double valeTransporte) {
		this.valeTransporte = valeTransporte;
	}
	
	
	
}
