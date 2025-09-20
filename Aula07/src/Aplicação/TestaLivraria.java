package Aplicação;

import Interface.*;

public class TestaLivraria {
    public static void main(String[] args) {
      
        Livro l1 = new Livro("Machado de Assis", "Dom Casmurro", 50.0);
        Livro l2 = new Livro("J. K. Rowling", "Harry Potter", 100.0);

     
        Operacao op1 = new Operacao("Venda", l1);
        op1.venderLivro();
        System.out.println(op1);

        Operacao op2 = new Operacao("Empréstimo", l2);
        op2.emprestarLivro();
        System.out.println(op2);

   
        System.out.println("Valor antigo do livro: " + l1.getValor());
        l1.reajuste(10); 
        System.out.println("Novo valor do livro após reajuste: " + l1.getValor());
    }
}