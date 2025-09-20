package IntrocucaoO.O;

public class Principal {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.titular = "Kleber Menezes";
		conta1.numero = 12345;
		conta1.depositar(1000.00);
		conta2.sacar(0);
		
		conta2.titular = "João Oliveira";
		conta2.numero = 17890;
		conta2.depositar(500.00);
		conta2.sacar(100.00);

		System.out.println("Dados da Conta 1:");
		conta1.exibirDados();

		System.out.println("\nDados da Conta 2:");
		conta2.exibirDados();
	}
}
