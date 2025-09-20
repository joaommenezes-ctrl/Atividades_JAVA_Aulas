package Scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um texto: ");
		String texto = input.next();

		System.out.print("Informe um número: ");
		int inteiro = input.nextInt();

		System.out.print("Informe um número real: ");
		double real = input.nextDouble();

		System.out.println("-----------------------------");
		System.out.println("Texto: " + texto);
		System.out.println("Número: " + inteiro);
		System.out.println("Número real: " + real);
		
		input.close();
	}

}

