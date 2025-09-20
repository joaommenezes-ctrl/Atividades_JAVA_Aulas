package Mecanica;

import java.time.LocalDate;

class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double trocarOleo() {
		double valor = TipoServico.OLEO.getValorPorServico();

		if (dataConserto.getDayOfWeek().getValue() == 6) {
			valor -= 50;
		}
		valorCobrado += valor;
		return valor;
	}

	@Override
    public double revisao() {
        double valor = TipoServico.REVISAO.getValorPorServico();
       
        if (dataConserto.getMonthValue() == 8) {
            valor *= 0.9; 
        valorCobrado += valor;
        
        }
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
		return super.toString() + ", Categoria: " + categoria;
	}

	public void revisao(int i) {
	
	}
}