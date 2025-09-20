package Atv_03;

public class Principal {
	public static void main(String[] args) {
		Calcular();
	}
	
	public static void Calcular(){
	Calculadora calc = new Calculadora();
	
	double resultado = calc.calcular(10, 5, 2);
	
	System.out.println("Resultado: " + resultado);
	}
}
