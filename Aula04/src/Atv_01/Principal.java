package Atv_01;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Adriano", 3000.00);
		
		String mensagem = String.format(
					"Nome: %s" +
					"\nSalário: %.2f" +
					"\nINSS: %.2f" +
					"\nVale Transporte: %.2f" +
					"\nSalário Líquido: % .2f",
					func1.getNome(),
					func1.getSalario(),
					func1.calcularInss(),
					func1.calcularValeTransporte(),
					func1.SalarioLiquido()
				);
		
		JOptionPane.showMessageDialog(null, mensagem, "Informações de um Funcinário: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
