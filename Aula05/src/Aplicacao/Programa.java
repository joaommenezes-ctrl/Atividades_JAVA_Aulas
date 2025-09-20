package Aplicacao;

import Renda.*;

public class Programa {
	
	public static void main(String[] args) {
		ImpostoDeRenda();
	}
	public static void ImpostoDeRenda() {
		PessoaFisica pf = new PessoaFisica("João", 1000.0);
		PessoaJuridica pj = new PessoaJuridica("Empresa Leva e Traz LTDA", 4500.50);
		
		pf.setCpf("161.650.507-94");
		pf.setRg("123.456.789-00");
		
		
		System.out.println("Objeto pf: " + pf.toString());
		System.out.println("Objeto pj: " + pj.toString());
	}
}
