package IntrocucaoO.O;

public class Conta {

	String titular;
	int numero;
	double saldo;

	public double depositar(double valor) {
		saldo += valor;
		return saldo;
	}

	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}

	public void exibirDados() {
		System.out.println("Titular: " + titular);
		System.out.println("Número da conta: " + numero);
		System.out.println("Saldo: R$" + saldo);
	}

}
