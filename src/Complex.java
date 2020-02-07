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

        //does the math and returns a Complex number
        return new Complex((getReal() + complex.getReal()), (getReal() + complex.getReal()));
    }

    //returns the argument for the complex number in radians
    public double arg() {
        if (getImag() == 0 && getReal() == 0) {
            throw new ArithmeticException("The imaginary part is 0");
        } else if (getReal() == 0) {
            return Math.signum(getImag())*(Math.PI/2);
        } else if (getReal() > 0) {
            return Math.atan((getImag()/getReal()));
        } else {
            if (getImag() < 0) {
                return Math.atan(((getImag()/getReal())-Math.PI));
            } else {
                return Math.atan(((getImag()/getReal())+Math.PI));
            }
        }
    }

    //returns the hash code of the complex number
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    //returns the real part of the complex number
    public double getReal() {
        return a;
    }

    //returns the imaginary part of the complex number
    public double getImag() {
        return b;
    }

    public static void main(String[] args) {
        Complex x = new Complex(2,3);
        Complex y = new Complex(2,3);

        System.out.println(x.toString());

        System.out.println(x.add(y).toString());

        System.out.println(x.arg());
    }
}
