package br.com.mlfr.calculadora;

import br.com.mlfr.calculadora.controller.*;
import br.com.mlfr.calculadora.modelo.*;
import br.com.mlfr.calculadora.view.*;

public class MVCcalculator {
	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theControllet = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
	}
}
