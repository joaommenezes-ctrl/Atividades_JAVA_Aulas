package Bar;

import java.time.LocalDate;

class Pedido {
    private LocalDate dataPedido;
    private Bebida bebida;
    private Sanduiche sanduiche;

    public Pedido(Bebida bebida, Sanduiche sanduiche) {
        this.dataPedido = LocalDate.now();
        this.bebida = bebida;
        this.sanduiche = sanduiche;
    }

   
    public static void imprimirCardapio() {
        System.out.println("===== CARDÁPIO =====");
        System.out.println("--- Sanduíches ---");
        for (Sanduiche s : Sanduiche.values()) {
            System.out.println(s);
        }
        System.out.println("\n--- Bebidas ---");
        for (Bebida b : Bebida.values()) {
            System.out.println(b);
        }
        System.out.println("====================\n");
    }

  
    public double calcularTotal() {
        return bebida.getValor() + sanduiche.getValor();
    }


    @Override
    public String toString() {
        return "Pedido realizado em: " + dataPedido +
               "\nSanduíche: " + sanduiche +
               "\nBebida: " + bebida +
               "\nTotal: R$ " + calcularTotal();
    }
}
