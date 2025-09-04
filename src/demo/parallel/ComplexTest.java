package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void testMinus() {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);
        Complex result = a.minus(b);
        assertEquals(3, result.getRe(), 1e-10);
        assertEquals(2, result.getIm(), 1e-10);
    }

    @Test
    public void testPLus() {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);
        Complex result = a.minus(b);
        assertEquals(3, result.getRe(), 1e+10);
        assertEquals(2, result.getIm(), 1e+10);
    }


}