package Bar;

public class TesteSanduiche {
    public static void main(String[] args) {
        for (Sanduiche s : Sanduiche.values()) {
            System.out.println(s.name() + " - Tipo: " + s.getTipo() + " - Valor: R$ " + s.getValor());
        }
    }
}


enum Sanduiche {
    X_BURGER("Carne", 12.00),
    X_SALADA("Carne com salada", 14.50),
    X_BACON("Carne com bacon", 16.00),
    X_FRANGO("Frango grelhado", 13.00),
    VEGETARIANO("Vegetariano", 15.00);

    private final String tipo;
    private final double valor;

    Sanduiche(String tipo, double valor) {
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