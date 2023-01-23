import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest(name = "[{index}] \"{0}\"")
    @MethodSource("expressions")
    public void testExpression(String expression, int expected) {
        // Given a calculator
        var calculator = new Calculator(expression);
        // when the phrase is capitalized
        var result = calculator.evaluate();

        // then it should equal the expected phrase
        assertEquals(expected, result);
    }

    /*
    @ParameterizedTest(name = "[{index}] \"{0}\"")
    @MethodSource("expressions")
    public void testError(String expression) {
        // Given a calculator with an invalid expression
        var calculator = new Calculator(expression);

        // then it should throw an exception when the expression is evaluated
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.evaluate();
        });
    }
     */

    public static Stream<Arguments> expressions() {
        return Stream.of(
                Arguments.of("0", 0)
                // Arguments.of("1 + 2", 3)
                // Arguments.of("1 + 2", 3)
                // ... more tests
                // Arguments.of("(1 + 2) * 5 / 2 + -3 * 7", -14)
        );
    }
    public static Stream<Arguments> errors() {
        return Stream.of(
                Arguments.of("foo")
        );
    }
}
