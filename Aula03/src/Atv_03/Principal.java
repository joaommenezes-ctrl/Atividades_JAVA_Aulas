package Atv_03;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("João Menezes", "(22) 999277746", "joao2025@gmail.com", 3200);
	
		String mensagem = "Nome : " + func1.getNome() +
						  "\nTelefone: " + func1.getTelefone() +
						  "\nEmail: " + func1.getEmail() +
						  "\nSalário com 10% de acréscimo: R$ " + String.format("%.2f", func1.getSalarioAcrescimo());
		
		JOptionPane.showMessageDialog(null, mensagem, "Dados de um Funcinário: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
