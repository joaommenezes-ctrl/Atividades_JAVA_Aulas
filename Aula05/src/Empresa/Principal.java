package Empresa;

public class Principal {
	public static void main(String[] args) {

		Gerente g = new Gerente("Fernanda", 5000.00, "TI");
		Assistente a = new Assistente("João", 2500.00, 100);

		g.aumentarSalario();
		a.aumentarSalario();

		System.out.println(g.toString());
		System.out.println("--------------------------------------------------");
		System.out.println(a.toString());
	}
}
