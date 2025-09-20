package Atv_03;


public class Funcionario {
	private String nome;
	private String telefone;
	private String email;
	private double salario;
	
	public Funcionario (String nome, String telefone, String email, double salario ) {
		this.nome= nome;
		this.telefone=telefone;
		this.email=email;
		this.salario=salario;
	}

	public String getNome() {
		return nome;
	}

	

	public String getTelefone() {
		return telefone;
	}

	

	public String getEmail() {
		return email;
	}

	

	public double getSalario() {
		return salario;
	}
	
	public double getSalarioAcrescimo() {
		return salario * 1.10;
	}
	
}
	
