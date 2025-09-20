package Testador;


public class Principal {
	public static void main(String[] args) {
		TestaMedico med1 = new TestaMedico();
		TestaMedico med2 = new TestaMedico();

		med1.setCrm(12345);
		med1.setNome("Ana Maria");
		med1.setSalario(0);
		med1.setValor_consulta(250);

		med2.setCrm(456789);
		med2.setNome("Antônio");
		med2.setSalario(0);
		med2.setValor_consulta(300);

		med1.pagamentoDinheiro();
		med1.pagamentoPlano();

		med2.pagamentoDinheiro();
		med2.pagamentoPlano();

		System.out.println("=== Dados dos Médicos ===");
		System.out.println("Médico 1:");
		System.out.println("Nome: " + med1.getNome());
		System.out.println("CRM: " + med1.getCrm());
		System.out.println("Salário: R$ " + med1.getSalario());

		System.out.println("\nMédico 2:");
		System.out.println("Nome: " + med2.getNome());
		System.out.println("CRM: " + med2.getCrm());
		System.out.println("Salário: R$ " + med2.getSalario());

		System.out.println("\nTotal de médicos: " + TestaMedico.getTotalMedicos());

	}
}
