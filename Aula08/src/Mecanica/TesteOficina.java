package Mecanica;

import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario("João");
        Carro carro = new Carro("Toyota Corolla", LocalDate.of(2025, 9, 15), proprietario, "Compacto");

        carro.trocarOleo();
        carro.revisao();

        System.out.println("Cliente: " + proprietario.getNome());
        System.out.println(carro);
        System.out.println("Valor cobrado: R$ " + carro.getValorCobrado());
    }
}
