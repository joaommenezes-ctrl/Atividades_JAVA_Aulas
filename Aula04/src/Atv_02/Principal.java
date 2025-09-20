package Atv_02;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		String resposta;

		do {
			String descricao = JOptionPane.showInputDialog("Produto:");
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));

			Produto produto = new Produto(descricao, valor, quantidade);

			double total = produto.calcularTotal();
			double icms = produto.calcularIcms();

			String mensagem = "Descrição: " + produto.getDescricao() + "\nValor: " + produto.getValor() + "\nTotal: "
					+ total + "\nICMS: " + icms;

			JOptionPane.showMessageDialog(null, mensagem);

			resposta = JOptionPane.showInputDialog("Deseja encerrar o programa? (S/N)").toUpperCase();

		} while (!resposta.equals("S"));
	}

}
