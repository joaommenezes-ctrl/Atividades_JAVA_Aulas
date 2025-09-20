package Renda;

public class PessoaJuridica extends ImpostoDeRenda {
    private String cnpj;
    private String inscEstadual;

    public PessoaJuridica(String nome, double rendimentos) {
        super(nome, rendimentos);

    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public double calculoIR() {
		return rendimentos * 0.15;
	}

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
    
    public String toString() {
		return "Nome: " + nome + " - Rendimentos = " + calculoIR() ; 
	}
}
