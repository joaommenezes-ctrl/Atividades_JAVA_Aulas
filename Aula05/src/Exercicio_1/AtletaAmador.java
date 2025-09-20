package Exercicio_1;

public class AtletaAmador extends Maratona {
    private String esporteFavorito;

    public AtletaAmador(String nome, int idade, double altura, String esporteFavorito) {
        super(nome, idade, altura);
        this.esporteFavorito = esporteFavorito;
    }

    public String getEsporteFavorito() {
        return esporteFavorito;
    }

    public String toString() {
        return super.toString() + ", Esporte Favorito: " + esporteFavorito;
    }
}