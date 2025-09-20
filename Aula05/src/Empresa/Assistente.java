package Empresa;

public class Assistente extends Funcionario {
	
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
	}
	
	public void aumentarSalario() {
		super.aumentarSalario();
		this.salario += adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

}
