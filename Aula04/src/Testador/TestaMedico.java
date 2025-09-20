package Testador;

public class TestaMedico {
	private static int totalMedicos = 0;
	
	public TestaMedico(){
		totalMedicos++;
	}
	
	public static int getTotalMedicos() {
		return totalMedicos;
	}
	
	private int crm;
	private String nome;
	private double salario;
	private double valor_consulta;

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValor_consulta() {
		return valor_consulta;
	}

	public void setValor_consulta(double valor_consulta) {
		this.valor_consulta = valor_consulta;
	}

	public void pagamentoDinheiro() {
		this.salario += valor_consulta;
	}

	public void pagamentoPlano() {
		this.salario += valor_consulta * 0.7;

	}
}

