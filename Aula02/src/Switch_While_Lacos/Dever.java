package Switch_While_Lacos;

import java.util.Scanner;

public class Dever {
	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3();
		exercicio4();
	}
	public static void exercicio1(){

		Scanner input = new Scanner(System.in);
		String estado, time;

		System.out.print("Digite a sigla do estado que você procura: ");
		estado = input.nextLine();

		switch (estado) {
		case "RJ":
			time = "Flamengo, Fluminense, Vasco, Botafogo";
		case "SP":
			time = "Corinthians, São Paulo, Palmeiras, Santos";
			break;
		default:
			time = "Estado não encontrado!";
			break;
		}
		System.out.println("Times do estado " + estado + ": " + time + ".");
		
		input.close();
	}
	
	public static void exercicio2(){
		int pares = 0;
		int impares = 0;

		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);

	}
	
	public static void exercicio3(){
		
		for (int i = 0; i <= 22; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " JAVA");
			}
		}
	}
	
	public static void exercicio4(){
		
		 for (int i = 1; i <= 10; i++) {
	            System.out.println("Tabuada do " + i + ":");
	            
	            for (int j = 1; j <= 10; j++) {
	                System.out.println(i + " x " + j + " = " + (i * j));
	            }
	          
	            
	            System.out.println(); 
		 }
	}
}
