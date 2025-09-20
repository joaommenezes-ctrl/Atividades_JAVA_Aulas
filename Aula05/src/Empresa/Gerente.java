package Empresa;

public class Gerente extends Funcionario {
	
	private String setor;

	public Gerente(String nome, double salario, String setor){
		super(nome, salario);
	}

	public void aumentarSalario() {
		super.aumentarSalario();
		this.salario += 200.00;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
