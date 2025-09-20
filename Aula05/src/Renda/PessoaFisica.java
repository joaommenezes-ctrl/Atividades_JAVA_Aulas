package Renda;

public class PessoaFisica extends ImpostoDeRenda {

	private String cpf;
	private String rg;

	public PessoaFisica(String nome, double rendimentos) {
		super(nome, rendimentos);
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public double calculoIR() {
		return rendimentos * 0.12;
	}
	
	public String toString() {
		return "Nome: " + nome + " - Rendimentos = " + calculoIR() + " -- " + cpf + " -- "+ rg; 
	}
}
