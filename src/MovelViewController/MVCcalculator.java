package MovelViewController;

public class MVCcalculator {
	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theControllet = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
	}
}
