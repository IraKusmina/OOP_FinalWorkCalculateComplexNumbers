package ComplexCalc.service;

import ComplexCalc.model.AdditionComplexNum;
import ComplexCalc.model.ComplexNumber;
import ComplexCalc.model.MultiplicationComplexNum;
import ComplexCalc.model.SubstractionComplexNum;

public class CheckOperationService {
    
    public void checkOperation(char operation, ComplexNumber num1, ComplexNumber num2){
        if (operation == '+'){
            AdditionComplexNum.additionNum(num1, num2);
        } else if (operation == '-'){
            SubstractionComplexNum.substrctionNum(num1, num2);
        } else if (operation == '*'){
            MultiplicationComplexNum.multiplicationNum(num1, num2);
        }   
    }
}
