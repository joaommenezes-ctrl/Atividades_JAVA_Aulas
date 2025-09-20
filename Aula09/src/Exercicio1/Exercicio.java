package Exercicio1;

import java.util.Scanner;

public class Exercicio {
	
	public static void main(String[] args) {
		//exercicio1();
		exemplo3();
	}
	
	public static void exercicio1(){
		int vetor1[] = {1,2,3,4,5};
		int vetor2[] = {3,0,2};
		int resultado = 0;
		
		for (int i = 0; i< vetor1.length; i++) {
			try{ 
				resultado = vetor1[i] / vetor2[i];
			} catch(ArithmeticException e) {
				System.out.println("Laço " + i + " Divisão por zero.");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Laço " + i + " Índice não encontrado.");
			} finally {
				System.out.println("Resultado " + i + ":" + resultado);
			}
		}
	}

	public static void exemplo3() {
	        @SuppressWarnings("resource")
	        Scanner input = new Scanner(System.in);

	        String funcionario[][] = new String[4][2];

	        
	        for (int i = 0; i < funcionario.length; i++) {
	            for (int j = 0; j < funcionario[i].length; j++) {
	                if (j == 0)
	                    System.out.println("Informe o nome " + (i + 1) + ":");
	                else
	                    System.out.println("Informe o telefone: ");
	                
	                funcionario[i][j] = input.nextLine();
	            }
	        }

	     
	        for (int linha = 0; linha < funcionario.length; linha++) {
	            System.out.println("\n---------------------");
	            for (int coluna = 0; coluna < funcionario[linha].length; coluna++) {
	                System.out.print(funcionario[linha][coluna] + (coluna == 0 ? " - " : "" + "\n"));
	            }
	        }
	}
}
