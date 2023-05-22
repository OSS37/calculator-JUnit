package va.suhano.calculatorJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static va.suhano.calculatorJUnit.Constants.*;

public class ServiceTest {

    private final Service service = new Service();

    @Test
    public void sum() {
        double actual = service.sum(five, six);
        double expected = five + six;
        assertEquals(actual, expected);
    }

    @Test
    public void sum2() {
        double actual = service.sum(zero, eight);
        double expected = zero + eight;
        assertEquals(actual, expected);
    }

    @Test
    public void minus() {
        double actual = service.minus(five, six);
        double expected = five - six;
        assertEquals(actual, expected);
    }

    @Test
    public void minus2() {
        double actual = service.minus(seven, eight);
        double expected = seven - eight;
        assertEquals(actual, expected);
    }

    @Test
    public void multiply() {
        double actual = service.multiply(five, six);
        double expected = five * six;
        assertEquals(actual, expected);
    }

    @Test
    public void multiply2() {
        double actual = service.multiply(seven, eight);
        double expected = seven * eight;
        assertEquals(actual, expected);
    }

    @Test
    public void divide() {
        double actual = service.divide(five, six);
        double expected = five / six;
        assertEquals(actual, expected);
    }

    @Test
    public void divide2() {
        double actual = service.divide(seven, six);
        double expected = seven / six;
        assertEquals(actual, expected);
    }

    @Test
    public void divide3() {
        assertThrows(DivideException.class, () -> service.divide(seven, zero));
    }

}
