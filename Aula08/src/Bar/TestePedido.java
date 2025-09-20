package Bar;

public class TestePedido {
    public static void main(String[] args) {
     
        Pedido.imprimirCardapio();

        Pedido p1 = new Pedido(Bebida.COCA_COLA, Sanduiche.X_BACON);

        System.out.println(p1);
    }
}