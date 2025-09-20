package Pessoa;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Pessoa 1:");
		System.out.print("Nome: ");
		String nome1 = input.nextLine();
		System.out.print("Peso (kg): ");
		double peso1 = input.nextDouble();
		System.out.print("Altura (m): ");
		double altura1 = input.nextDouble();
		input.nextLine(); 
		
		System.out.println("\nPessoa 2:");
		System.out.print("Nome: ");
		String nome2 = input.nextLine();
		System.out.print("Peso (kg): ");
		double peso2 = input.nextDouble();
		System.out.print("Altura (m): ");
		double altura2 = input.nextDouble();
		input.nextLine(); 
		
		System.out.println("\nPessoa 3:");
		System.out.print("Nome: ");
		String nome3 = input.nextLine();
		System.out.print("Peso (kg): ");
		double peso3 = input.nextDouble();
		System.out.print("Altura (m): ");
		double altura3 = input.nextDouble();
		input.nextLine(); 
		
		System.out.println("\nPessoa 4:");
		System.out.print("Nome: ");
		String nome4 = input.nextLine();
		System.out.print("Peso (kg): ");
		double peso4 = input.nextDouble();
		System.out.print("Altura (m): ");
		double altura4 = input.nextDouble();
		input.nextLine(); 
		
		Pessoa pessoa1 = new Pessoa(nome1, peso1, altura1);
		Pessoa pessoa2 = new Pessoa(nome2, peso2, altura2);
		Pessoa pessoa3 = new Pessoa(nome3, peso3, altura3);
		Pessoa pessoa4 = new Pessoa(nome4, peso4, altura4);

		
		Pessoa maiorPeso = pessoa1;
		if (pessoa2.getPeso() > maiorPeso.getPeso())
			maiorPeso = pessoa2;
		if (pessoa3.getPeso() > maiorPeso.getPeso())
			maiorPeso = pessoa3;
		if (pessoa4.getPeso() > maiorPeso.getPeso())
			maiorPeso = pessoa4;

		Pessoa maiorAltura = pessoa1;
		if (pessoa2.getAltura() > maiorAltura.getAltura())
			maiorAltura = pessoa2;
		if (pessoa3.getAltura() > maiorAltura.getAltura())
			maiorAltura = pessoa3;
		if (pessoa4.getAltura() > maiorAltura.getAltura())
			maiorAltura = pessoa4;


		double mediaPeso = (pessoa1.getPeso() + pessoa2.getPeso() + pessoa3.getPeso() + pessoa4.getPeso())/4;
		double mediaAltura = (pessoa1.getAltura() + pessoa2.getAltura() + pessoa3.getAltura() + pessoa4.getAltura())/4;

	
		System.out.println("\nPessoa com maior peso: " + maiorPeso.getNome());
		System.out.println("Pessoa com maior altura: " + maiorAltura.getNome());
		System.out.printf("Média de peso: %.2f kg\n", mediaPeso);
		System.out.printf("Média de altura: %.2f m\n", mediaAltura);

		input.close();
	}
}
