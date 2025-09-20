package Exercicio_1;

public class AtletaProfissional extends Maratona {
    private String patrocinador;

    public AtletaProfissional(String nome, int idade, double altura, String patrocinador) {
        super(nome, idade, altura);
        this.patrocinador = patrocinador;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public String toString() {
        return super.toString() + ", Patrocinador: " + patrocinador;
    }
}