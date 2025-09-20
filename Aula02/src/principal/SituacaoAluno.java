package principal;

import java.util.Scanner;

public class SituacaoAluno {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double nota1 = 10.0, nota2 = 6.5, media;
	
	
	media = (nota1 + nota2) /2;
	
		if(media == 10.0) {
			System.out.println("Aprovado Parabéns.");
		} else if(media >= 7.0) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado.");
		}	
		
		input.close();
	}	
}
