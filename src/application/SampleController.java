package application;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class SampleController {
	
	public SampleController() {
		
	}
	
	@FXML
	Button button_0;
	
	@FXML
	Button button_1;
	
	@FXML
	Button button_2;
	
	@FXML
	Button button_3;
	
	@FXML
	Button button_4;
	
	@FXML
	Button button_5;
	
	@FXML
	Button button_6;
	
	@FXML
	Button button_7;
	
	@FXML
	Button button_8;
	
	@FXML
	Button button_9;
	
	@FXML
	TextField operationInput;
	
	@FXML
	Button calculate;
	
	@FXML
	Button sum;
	
	@FXML
	Button subs;
	
	@FXML
	Button mult;
	
	@FXML
	TextArea historialImput;
	
	@FXML
	TextField resultImput;
	
	@FXML
	private void but_0(){
		
		operationInput.setText(operationInput.getText() + "0");
	}
	
	@FXML
	private void but_1(){
		operationInput.setText(operationInput.getText()+"1");		
	}
	@FXML
	private void but_2(){
		operationInput.setText(operationInput.getText()+"2");
	}
	@FXML
	private void but_3(){
		operationInput.setText(operationInput.getText()+"3");
	}
	@FXML
	private void but_4(){
		operationInput.setText(operationInput.getText()+ "4");
	}
	@FXML
	private void but_5(){
		operationInput.setText(operationInput.getText()+"5");
	}
	@FXML
	private void but_6(){
		operationInput.setText(operationInput.getText()+"6");
	}
	@FXML
	private void but_7(){
		operationInput.setText(operationInput.getText()+"7");
	}
	@FXML
	private void but_8(){
		operationInput.setText(operationInput.getText()+"8");
	}
	@FXML
	private void but_9(){
		operationInput.setText(operationInput.getText()+"9");
	}
	@FXML
	private void button_multiply(){
		operationInput.setText(operationInput.getText()+"*");
	}
	@FXML
	private void button_sum(){
		operationInput.setText(operationInput.getText()+"+");
	}
	@FXML
	private void button_subtraction(){
		operationInput.setText(operationInput.getText()+"-");
	}	
	
	@FXML
	private void calculate() {
		char[] operation = operationInput.getText().toCharArray();
		int numOperations = 0;
		int operatorIndex = -1;
		
		for (int i=0; i<operation.length; i++) {
			if (operation[i] == '+' || operation[i] == '*' || operation[i] == '-') {
				operatorIndex = i;
				numOperations++;
			}
		}
		
		if (numOperations>1) {
			resultImput.setText("**SYNTAX ERROR**");
		} else {
			String number = "";
			for (int i=0; i<operatorIndex; i++) {
				number += operation[i];
			}
			int num1 = Integer.parseInt(number);
			
			number = "";
			for (int i=operatorIndex+1; i<operation.length; i++) {
				number += operation[i];
			}
			
			int num2 = Integer.parseInt(number);
			
			int result = 0;
			if (operation[operatorIndex] == '+') {
				result = num1+num2;
			} else if (operation[operatorIndex] == '-') {
				result = num1-num2;
			} else {
				result = num1*num2;
			}
			
			resultImput.setText("" + result);
			historialImput.setText(historialImput.getText() + operationInput.getText() + " = " + result + "\n");
			operationInput.setText("");
		}
	}
	
}
