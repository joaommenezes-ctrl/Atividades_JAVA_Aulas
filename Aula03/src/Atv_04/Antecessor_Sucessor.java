package Atv_04;

import java.util.Scanner;

public class Antecessor_Sucessor {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = input.nextInt();

		int antecessor = numero - 1;
		int sucessor = numero + 1;

		System.out.println("Antecessor: " + antecessor);
		System.out.println("Sucessor: " + sucessor);

		input.close();
	}
}
