

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Class description
 * 2020-02-07
 * Author: Elliot Duchek
 */
public class ComplexUnitTest {
    @Test
    public void shouldBeAbleToCreateComplex() {
        new Complex(3,2);
    }

    @Test
    public void shouldHaveCorrectRealAndImaginaryParts() {
        double precision = 1.0/1000;
        Complex z = new Complex(3,2);
        assertEquals(3, z.getReal(),precision);
        assertEquals(2, z.getImag(),precision);
    }

    @Test
    public void shouldBeAbleToAdd() {
        Complex a = new Complex(3.0,2.0);
        Complex b = new Complex(4.0,1.0);
        Complex c = a.add(b);
    }

    @Test
    public void shouldBeAbleToAddCorrectly() {
        double precision = 1.0/1000;
        Complex a = new Complex(3.0,2.0);
        Complex b = new Complex(4.0,1.0);
        Complex c = a.add(b);
        assertEquals(7,c.getReal(),precision);
        assertEquals(3,c.getImag(),precision);
    }

    @Test
    public void shouldBeAbleToMultiply() {
        Complex a = new Complex(3.0,2.0);
        Complex b = new Complex(4.0,1.0);
        Complex c = a.multiply(b);
    }

    @Test
    public void shouldBeAbleToAddMultiplyCorrectly() {
        double precision = 1.0/1000;
        Complex a = new Complex(3.0,2.0);
        Complex b = new Complex(4.0,1.0);
        Complex c = a.multiply(b);
        assertEquals(10,c.getReal(),precision);
        assertEquals(11,c.getImag(),precision);
    }

    @Test
    public void shouldBeAbleToCheckForEquals() {
        Complex a = new Complex(3.0,2.0);
        Complex b = new Complex(3.0,2.0);
        Complex c = new Complex(4,1);
        String d = "3.0 + 2.0i";
        assertEquals(true,a.equals(a));
        assertEquals(true,a.equals(b));
        assertEquals(false,a.equals(c));
        assertEquals(false,a.equals(null));
        assertEquals(false,a.equals(d));
    }

    @Test
    public void shouldBeAbleToConvertToString() {
        Complex a = new Complex(3.0,2.0);
        String d = "3.0 + 2.0i";
        assertEquals(d,a.toString());
    }

    @Test
    public void shouldBeAbleToCalculateArg() {
        Complex a = new Complex(3.0,2.0);
        a.arg();
    }

    @Test
    public void shouldBeAbleToCalculateArgCorrectly() {
        double precision = 1.0/1000;
        Complex a = new Complex(3.0,2.0);
        assertEquals(Math.atan(2.0/3.0),a.arg(),precision);
    }

    @Test
    public void shouldBeAbleToCalculateArgCorrectlyInOtherQuadrants() {
        double precision = 1.0/1000;

        Complex a = new Complex(-3.0,2.0);
        assertEquals(Math.atan2(2,-3),a.arg(),precision);

        a = new Complex(3.0,-2.0);
        assertEquals(Math.atan2(-2,3),a.arg(),precision);

        a = new Complex(-3.0,-2.0);
        assertEquals(Math.atan2(-2,-3),a.arg(),precision);
    }

    @Test
    public void shouldBeAbleToCalculateArgCorrectlyOnAxis() {
        double precision = 1.0/1000;

        Complex a = new Complex(0,1.0);
        assertEquals(Math.atan2(1,0),a.arg(),precision);

        a = new Complex(0,-1.0);
        assertEquals(Math.atan2(-1,0),a.arg(),precision);

        a = new Complex(1,0);
        assertEquals(Math.atan2(0,1),a.arg(),precision);

        a = new Complex(-1,0);
        assertEquals(Math.atan2(0,-1),a.arg(),precision);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionIfTakingArgOfZero() throws Exception {
        Complex a =  new Complex(0,0);
        a.arg();
    }
}
