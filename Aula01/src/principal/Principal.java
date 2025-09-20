package principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Fala João");
		
		//Tipos de dados
		/*
		 * cadeia = String
		 * inteiro = int
		 * real = double / float
		 * lógico = boolean
		 * caracter = char
		 */
		
		String nome;
		int numero;
		double valor;
		boolean continuar;
		char letra;
		
		nome ="João Gabriel Menezes Marra";
		numero = 19;
		valor = 500.5;
		continuar = true;
		continuar = false;
		letra = 'j';
		
		System.out.print("Informe seu nome: ");
		nome = input.nextLine();
		
		System.out.println("Seja bem-vindo, " + nome);
		if(numero >= 18) {
			System.out.println("maior de idade");
			System.out.println("Você tem " + numero + " anos");
		}
		else {
			System.out.println("menor de idade");
		}
		
		 imprimirNotas();
	}
	
	public static void imprimirNotas() {
	Scanner input = new Scanner(System.in); 
		System.out.print("Digite a primeira nota: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = input.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = input.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double nota4 = input.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média do aluno é " + media);
			input.close();
	}
	
}