import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizorTest {

    @ParameterizedTest(name = "[{index}] \"{0}\"")
    @MethodSource("capitalizedPhrases")
    public void capitalize(String phrase, String expected) {
        // when the phrase is capitalized
        String capitalized = Capitalizor.capitalize(phrase);

        // then it should equal the expected phrase
        assertEquals(expected, capitalized);
    }

    public static Stream<Arguments> capitalizedPhrases() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("a", "A"),
                Arguments.of("hello", "Hello"),
                Arguments.of("èlo", "Èlo"),
                Arguments.of("Hello", "Hello"),
                Arguments.of("hello world!", "Hello World!"),
                Arguments.of("world èlo", "World Èlo")
        );
    }
}
