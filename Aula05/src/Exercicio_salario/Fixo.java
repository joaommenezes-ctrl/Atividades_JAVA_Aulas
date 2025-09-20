package Exercicio_salario;

public class Fixo extends Vendedor {
    private double salarioBase;
    private double salarioBruto;
    private double percentualComissao; 

    public Fixo(String nome, int codigo, double salarioBase, double percentualComissao) {
        super(nome, codigo);
        this.salarioBase = salarioBase;
        this.salarioBruto = salarioBase; 
        this.percentualComissao = percentualComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void calcularSalario(double valorVenda) {
        double comissao = valorVenda * percentualComissao;
        this.salarioBruto += comissao;
    }


    public String toString() {
        return super.toString() +
               ", Salário Base: " + salarioBase +
               ", Salário Bruto: " + salarioBruto +
               ", Comissão: " + (percentualComissao * 100) + "%";
    }
}