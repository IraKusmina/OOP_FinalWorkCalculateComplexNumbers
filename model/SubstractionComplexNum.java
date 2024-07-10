package ComplexCalc.model;
// вычитание
public class SubstractionComplexNum {
    ComplexNumber num1;
    ComplexNumber num2;
    
    public static void substrctionNum(ComplexNumber num1, ComplexNumber num2){
        int resultReal = num1.getReal() - num2.getReal();
        int resultImaginary = num1.getImaginary() - num2.getImaginary();
        ComplexNumber result = new ComplexNumber(resultReal, resultImaginary);
        System.out.println(result);
    }
}
