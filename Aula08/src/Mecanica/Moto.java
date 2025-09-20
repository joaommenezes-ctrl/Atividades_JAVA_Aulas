package Mecanica;

import java.time.LocalDate;

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
        super(modelo, dataConserto, proprietario);
        this.cilindradas = cilindradas;
    }

    @Override
    public double trocarOleo() {
        double valor = TipoServico.OLEO.getValorPorServico();
        valorCobrado += valor;
        return valor;
    }

    @Override
    public double revisao() {
        double valor = TipoServico.REVISAO.getValorPorServico();
        valorCobrado += valor;
        return valor;
    }

    @Override
    public double lavarVeiculo() {
        double valor = TipoServico.LAVAGEM.getValorPorServico();
        valorCobrado += valor;
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas;
    }
}