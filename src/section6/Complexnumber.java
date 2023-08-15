package section6;

public class Complexnumber {
    private double real;
    private double imaginary;

    public Complexnumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real,double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(Complexnumber complexnumber){
       real += complexnumber.getReal();
       imaginary += complexnumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(Complexnumber complexnumber){
        real -= complexnumber.getReal();
        imaginary -= complexnumber.getImaginary();
    }
}
