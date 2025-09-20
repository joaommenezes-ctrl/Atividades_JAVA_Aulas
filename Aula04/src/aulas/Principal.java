package aulas;

public class Principal {
	public static void main(String[] args) {
		Medico mc1 = new Medico();
		
		mc1.setCrm(12345);
		mc1.setNome("João Menezes");
		mc1.setValor_consulta(100);
		mc1.setSalario(2500);
		
		mc1.pagamentoDinheiro();
		mc1.pagamentoPlano();
		
		System.out.println("Dados do Médico:");
		System.out.println("Nome: " + mc1.getNome());
		System.out.println("Crm: " + mc1.getCrm());
		System.out.println("Salário com o valor da consulta : " + mc1.getSalario());
		
	}
}
