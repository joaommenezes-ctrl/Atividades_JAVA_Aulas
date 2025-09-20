package Mecanica;

import java.time.LocalDate;

abstract class Veiculo implements Oficina {
    protected String modelo;
    protected double valorCobrado = 0;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;

    public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Data Conserto: " + dataConserto;
    }
}