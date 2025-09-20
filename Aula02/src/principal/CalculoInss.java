package principal;

import java.util.Scanner;

public class CalculoInss {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = 0, desconto = 0;
		String nome;

		System.out.print("Por favor, digite o seu nome: ");
		nome = input.nextLine();
		
		System.out.print("Digite o seu salário: ");
		salario = input.nextDouble();
		
			if(salario >= 1518.01 && salario <= 2793.88) {
				desconto = salario * 0.09;
			} else if(salario >= 2793.88 && salario <= 4190.83) {
				desconto = salario * 0.12;
			}	else if(salario >= 4190.84 && salario <= 8157.41) {
				desconto = salario * 0.14;
			}	
		double salario_com_desconto = salario - desconto;
		
		System.out.println("Obrigado por fornecer seus dados Sr. ou Sra. " + nome + ", abaixo estão as informações:");
		System.out.println("Salário bruto: R$ " + salario);
        System.out.println("Desconto INSS: R$ " + desconto);
        System.out.println("Salário com desconto: R$ " + salario_com_desconto);
        
        input.close();
	}
}
