package va.suhano.calculatorJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static va.suhano.calculatorJUnit.Constants.*;


public class ServicePerametrTest {
    private final Service service = new Service();
    public static Stream<Arguments> provideParamTests() {
        return Stream.of(
                Arguments.of(five, six),
                Arguments.of(seven, eight),
                Arguments.of(zero, eight)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamTests")
    public void sum(double num1, double num2) {
        double actual = service.sum(num1,num2);
        Assertions.assertEquals(num1+num2, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamTests")
    public void minus(double num1, double num2) {
        double actual = service.minus(num1,num2);
        Assertions.assertEquals(num1-num2, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamTests")
    public void multiply(double num1, double num2) {
        double actual = service.multiply(num1,num2);
        Assertions.assertEquals(num1*num2, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamTests")
    public void divide(double num1, double num2) {
        double actual = service.divide(num1,num2);
        Assertions.assertEquals(num1/num2, actual);
    }
}
