package nguyenxuannghia_20001954_lab5.part1.ex7;

public class MyComplex {

    private double real;
    private double imag;

    public MyComplex() {
        real = 0;
        imag = 0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return real + " + " + imag;
    }

    public boolean isReal() {
        return Double.compare(imag, 0.0) == 0;
    }

    public boolean isImaginary() {
        return Double.compare(real, 0.0) == 0;
    }

    public boolean equals(double real, double imag) {
        return Double.compare(real, imag) == 0 ;
    }

    public boolean equals(MyComplex another) {
        return Double.compare(this.real, another.getReal()) == 0
                && Double.compare(this.imag, another.getImag()) == 0;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex result = new MyComplex();
        result.setReal(this.real + right.getReal());
        result.setImag(this.imag + right.getImag());
        return result;
    }
}
