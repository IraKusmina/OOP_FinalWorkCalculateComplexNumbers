package ComplexCalc.model;

public class Operations {
    ComplexNumber num1;
    ComplexNumber num2;
    char operation;

    void operations (ComplexNumber num1, ComplexNumber num2, char operation){
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    } 

    void operation(){
        
    }

    public ComplexNumber getNum1() {
        return num1;
    }

    public ComplexNumber getNum2() {
        return num2;
    }

    public void setNum1(ComplexNumber num1) {
        this.num1 = num1;
    }

    public void setNum2(ComplexNumber num2) {
        this.num2 = num2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
}
