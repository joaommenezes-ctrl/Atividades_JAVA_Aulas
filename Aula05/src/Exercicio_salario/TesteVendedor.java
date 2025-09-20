package Exercicio_salario;

import java.util.Scanner;

public class TesteVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Fixo vendedor1 = new Fixo("João", 1, 2000.0, 0.03); 
        Fixo vendedor2 = new Fixo("Maria", 2, 2000.0, 0.03); 
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Registrar venda para " + vendedor1.getNome());
            System.out.println("2 - Registrar venda para " + vendedor2.getNome());
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da venda: ");
                    double venda1 = sc.nextDouble();
                    vendedor1.calcularSalario(venda1);
                    break;

                case 2:
                    System.out.print("Digite o valor da venda: ");
                    double venda2 = sc.nextDouble();
                    vendedor2.calcularSalario(venda2);
                    break;

                case 3:
                    System.out.println("\nSaindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

   
        System.out.println("\n=== Salários Brutos Finais ===");
        System.out.println(vendedor1.getNome() + ": R$ " + vendedor1.getSalarioBruto());
        System.out.println(vendedor2.getNome() + ": R$ " + vendedor2.getSalarioBruto());

        sc.close();
    }
}