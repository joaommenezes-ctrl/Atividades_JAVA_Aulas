package Mecanica;

class Proprietario {
    private String nome;

    public Proprietario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Proprietario: " + nome;
    }
}