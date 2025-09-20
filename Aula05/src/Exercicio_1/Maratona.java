package Exercicio_1;

public class Maratona {
    private String nome;
    private int idade;
    private double altura;

  
    public Maratona(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }


    public void verificaSituacao() {
        if (idade > 18 || altura >= 1.80) {
            System.out.println(nome + " participará da competição.");
        } else {
            System.out.println(nome + " não participará da competição.");
        }
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura;
    }
}