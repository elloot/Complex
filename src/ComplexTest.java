/**
 * Class description
 * 2020-02-07
 * Author: Elliot Duchek
 */
public class ComplexTest {

    public static void main(String[] args) {
        Complex a = new Complex(3.0, 2.0);
        Complex b = new Complex(4.0, 1.0);

        System.out.println("talet borde vara 3 + 2i:\n" + a);

        Complex c = a.add(b);
        Complex d = new Complex(7, 3);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("add funkar!!");
        }

        c = a.multiply(b);
        d = new Complex(10, 11);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("multiply funkar!!");
        }

        System.out.println("Argumentet till 3+2i är " + a.arg());
        if (a.arg() == Math.atan(2.0 / 3)) {
            System.out.println("arg() funkar!!");
        }
    }
}
