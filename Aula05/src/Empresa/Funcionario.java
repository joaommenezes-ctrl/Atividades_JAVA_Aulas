package Empresa;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void aumentarSalario() {
		this.salario += salario * 0.02;
	}

	public String toString() {
		return "Funcionário [ Nome: " + nome + " / Salário: R$ " + salario + "]" ;
	}
}
