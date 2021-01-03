package CharactersAndAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class ConversionFunctionsTest {
    ConversionFunctions conversionFunctions = new ConversionFunctions();

    static Stream<Arguments> intTest_NOMINAL() {
        return Stream.of(
                arguments(-5, "-5"),
                arguments(0, "0"),
                arguments(5, "5"),
                arguments(1000, "1000"),
                arguments(-1000, "-1000"),
                arguments(10050, "10050")
        );
    }
    static Stream<Arguments> getStrFromDoubleTest_NOMINAL() {
        return Stream.of(
                arguments(0.0, "0.0"),
                arguments(25.0, "25.0"),
                arguments(-25.0, "-25.0"),
                arguments(-25.4221, "-25.4221"),
                arguments(25.4221, "25.4221"),
                arguments(10050.0, "10050.0")
        );
    }
    static Stream<Arguments> getDoubleFromStrTest_NOMINAL() {
        return Stream.of(
                arguments("0", 0.0),
                arguments("", 0.0),
                arguments("0.0", 0.0),
                arguments("25.0", 25.0),
                arguments("-25.0", -25.0),
                arguments("-25.422145568", -25.422145568),
                arguments("25.4221455", 25.4221455),
                arguments("10050", 10050.0)
        );
    }

    @ParameterizedTest
    @MethodSource("intTest_NOMINAL")
    void getStrFromIntTest(int number, String expected) {
        String actual = conversionFunctions.getStrFromInt(number);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("getStrFromDoubleTest_NOMINAL")
    void getStrFromDoubleTest(double number, String expected) {
        String actual = conversionFunctions.getStrFromDouble(number);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("intTest_NOMINAL")
    void getIntFromStrTest(int expected, String number) {
        int actual = conversionFunctions.getIntFromStr(number);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("getDoubleFromStrTest_NOMINAL")
    void getDoubleFromStrTest(String number, double expected) {
        double actual = conversionFunctions.getDoubleFromStr(number);
        Assertions.assertEquals(expected,actual);
    }
}