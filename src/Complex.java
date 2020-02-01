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

    //checks if two complex numbers are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.a, a) == 0 &&
                Double.compare(complex.b, b) == 0;
    }

    //returns the input complex number as a correctly formatted string
    @Override
    public String toString() {
        return "Re(" + a + ") " +
                "Im(" + b + 'i' + ')';
    }

    //returns the sum of two complex numbers
    public Complex add(Object o) {
        //casts the 'y'-object from x.add('y') to a Complex number
        Complex complex = (Complex) o;

        //assigns the real and imaginary parts of the complex number x to variables
        double real = getReal();
        double imag = getImag();

        //same thing for y
        double real2 = complex.getReal();
        double imag2 = complex.getImag();

        //does the math and returns a Complex number
        return new Complex((real + real2), (imag + imag2));
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

        System.out.println(x.toString());

        System.out.println(x.add(y).toString());
    }
}
