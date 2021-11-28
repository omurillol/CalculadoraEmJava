package br.com.mlfr.calculadora.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.Action;

import br.com.mlfr.calculadora.modelo.*;
import br.com.mlfr.calculadora.view.CalculatorView;
import br.com.mlfr.calculadora.*;
import br.com.mlfr.calculadora.controller.*;

public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theview, CalculatorModel theModel) {
		this.theView = theview;
		this.theModel = theModel;

		this.theView.addCalculateListener(new CalculateListener());

	}

	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
		
			try {
			firstNumber = theView.getFirstNumber();
			secondNumber = theView.getSecondNumber();
			
			theModel.addTwoNumbers(firstNumber, secondNumber);
			
			theView.setCalcSolution(theModel.getCalculationValue());
			}
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("You need to enter 2 Integer");
			}
		}
	}
}
