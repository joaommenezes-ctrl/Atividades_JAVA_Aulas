package Renda;

public class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimentos; 
	
	public ImpostoDeRenda(String nome, double rendimentos){
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
