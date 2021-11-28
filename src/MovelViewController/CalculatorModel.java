package MovelViewController;

//O modelo performa todos os calculos necessários. Não tem conhecimento da existência da view.
//O mdoelo permite o acesso aos dados
public class CalculatorModel {
	private int calculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		calculationValue = firstNumber + secondNumber;
	}
	
	public int getCalculationValue() {
		return calculationValue;
	}
}
