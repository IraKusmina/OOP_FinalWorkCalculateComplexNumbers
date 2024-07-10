package ComplexCalc.model;

public class ComplexNumber {
    int real;
    int imaginary;
    
    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }
    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0){
            return real + " + " + imaginary + "i";
        } else {
            imaginary = imaginary * -1;
            return real + " - " + imaginary + "i";
        }
    }

}
