package Atv_03;

import javax.swing.JOptionPane;

public class MainCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int opcao = 0;

		while (opcao != 5) {
			try {
				String menu = "Escolha uma operação:\n" + 
							  "1 – Soma\n" + 
						      "2 – Subtração\n" + 
							  "3 – Multiplicação\n"	+ 
						   	  "4 – Divisão\n" + 
						      "5 – Sair";

				opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

				if (opcao == 5) {
					JOptionPane.showMessageDialog(null, "Programa encerrado.");
					break;
				}

				if (opcao < 1 || opcao > 5) {
					JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
					continue;
				}

				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
				double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

				double resultado = calc.calcular(num1, num2, opcao);

				if (Double.isNaN(resultado)) {
					JOptionPane.showMessageDialog(null, "Erro: divisão por zero ou operação inválida.");
				} else {
					String operacaoStr = switch (opcao) {
					case 1 -> "Soma";
					case 2 -> "Subtração";
					case 3 -> "Multiplicação";
					case 4 -> "Divisão";
					default -> "Operação";
					};

					JOptionPane.showMessageDialog(null, operacaoStr + " = " + resultado);
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro: entrada inválida. Digite apenas números.");
			}
		}
	}

}
