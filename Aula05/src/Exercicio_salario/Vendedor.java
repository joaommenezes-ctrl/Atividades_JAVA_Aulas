package Exercicio_salario;

public class Vendedor {
    private String nome;
    private int codigo;

    public Vendedor(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome;
    }
}
