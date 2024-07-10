package ComplexCalc.model;

// Умножение
public class MultiplicationComplexNum {
    ComplexNumber num1;
    ComplexNumber num2;
    
    public static void multiplicationNum(ComplexNumber num1, ComplexNumber num2){
        int firstPart = num1.getReal() * num2.getReal() - num1.getImaginary()*num2.getImaginary();
        int secondPart = num1.getImaginary() * num2.getReal() + num1.getReal() * num2.getImaginary();
        ComplexNumber result = new ComplexNumber(firstPart, secondPart);
        System.out.println(result);
    }

}
