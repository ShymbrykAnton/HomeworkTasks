package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class FunctionsTest {
    private final Functions functions = new Functions();
    static Stream<Arguments> getStringFromNumberOrNumberFromStringTest_NOMINAL() {
        return Stream.of(
                arguments(0,"Ноль"),
                arguments(5,"Пять"),
                arguments(19,"Девятнадцать"),
                arguments(50,"Пятьдесят"),
                arguments(100,"Сто"),
                arguments(308,"Триста Восемь"),
                arguments(514,"Пятьсот Четырнадцать"),
                arguments(350,"Триста Пятьдесят"),
                arguments(669,"Шестьсот Шестьдесят Девять"),
                arguments(128,"Сто Двадцать Восемь"),
                arguments(58,"Пятьдесят Восемь")
        );
    }

    @ParameterizedTest
    @MethodSource("getStringFromNumberOrNumberFromStringTest_NOMINAL")
    void getStringFromNumberTest(int number, String expected) {
        String actual = functions.getStringFromNumber(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getStringFromNumberOrNumberFromStringTest_NOMINAL")
    void getNumberFromStringTest(int expected, String number) {
        int actual = functions.getNumberFromString(number);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getStringFromNumberTest_INVALID1() {
        String expected = "Выход за пределы допустимого диапазона";
        String actual = functions.getStringFromNumber(1005);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getStringFromNumberTest_INVALID2() {
        String expected = "Выход за пределы допустимого диапазона";
        String actual = functions.getStringFromNumber(-5);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getNumberFromStringTest_INVALID2() {
        int expected = 0;
        int actual = functions.getNumberFromString("");
        Assertions.assertEquals(expected,actual);
    }
}