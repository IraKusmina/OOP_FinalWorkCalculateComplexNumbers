package ComplexCalc.controller;

import ComplexCalc.model.ComplexNumber;
import ComplexCalc.service.CheckOperationService;

public class CalcNumberController {
    CheckOperationService checkOperationService = new CheckOperationService();
    
    public void checkOperation(char operation, ComplexNumber num1, ComplexNumber num2){
        checkOperationService.checkOperation(operation, num1, num2);
    }
}
