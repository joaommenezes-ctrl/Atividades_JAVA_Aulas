package Interface;

public class Livro {
    private String autor;
    private String titulo;
    private double valor;

    public Livro(String autor, String titulo, double valor) {
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro [Autor=" + autor + ", Titulo=" + titulo + ", Valor=" + valor + "]";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void reajuste(double percentual) {
        this.valor += this.valor * (percentual / 100);
    }
}