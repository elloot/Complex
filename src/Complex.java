/**
 * A program that handles complex numbers
 * 2020-01-31
 * Author: Elliot Duchek
 */
public class Complex {
    private double real;
    private double imag;

    public Complex(double a, double b) {
        this.real = a;
        this.imag = b;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }
}
