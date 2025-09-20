package Bar;

public class TesteBebida {
    public static void main(String[] args) {
        for (Bebida b : Bebida.values()) {
            System.out.println(b.name() + " - Tipo: " + b.getTipo() + " - Valor: R$ " + b.getValor());
        }
    }
}

enum Bebida {
    COCA_COLA("Refrigerante", 5.50),
    SUCO_LARANJA("Suco", 7.00),
    CAFE("Quente", 3.00),
    AGUA("Mineral", 2.50);

    private final String tipo;
    private final double valor;

    Bebida(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}