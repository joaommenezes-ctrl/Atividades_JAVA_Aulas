package Atv_03;

public class Calculadora {
	public double calcular (double num1, double num2, int operacao) {
		switch(operacao) {
		case 1:
			return num1 + num2;
		case 2:
			return num1 - num2;
		case 3:
			return num1 * num2;
		case 4:
			if(num2 != 0) {
				return num1 / num2;
			}else {
				return Double.NaN;
			}
			
		default:
			return Double.NaN;
		}
		
		
	}

}
