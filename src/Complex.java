import java.util.Objects;

/**
 * A program that handles complex numbers
 * 2020-01-31
 * Author: Elliot Duchek
 */
public class Complex {
    private double a;
    private double b;

    public Complex(double real, double imag) {
        this.a = real;
        this.b = imag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.a, a) == 0 &&
                Double.compare(complex.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public double getReal() {
        return a;
    }

    public double getImag() {
        return b;
    }

    public static void main(String[] args) {
        Complex x = new Complex(2,3);
        Complex y = new Complex(2,3);

    }
}
