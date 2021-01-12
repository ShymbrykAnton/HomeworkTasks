package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class CyclesTest {
    private final Cycles cycles = new Cycles();

    static Stream<Arguments> getEvenSumNumberTest_NOMINAL() {
        return Stream.of(
                arguments(1, "Колличество четных чисел: " + 0 + "\nСумма четных чисел: " + 0),
                arguments(2, "Колличество четных чисел: " + 1 + "\nСумма четных чисел: " + 2),
                arguments(5, "Колличество четных чисел: " + 2 + "\nСумма четных чисел: " + 6),
                arguments(10, "Колличество четных чисел: " + 5 + "\nСумма четных чисел: " + 30),
                arguments(0, "Ваше число выходит за рамки допустимого диапазона [1-99]"),
                arguments(100, "Ваше число выходит за рамки допустимого диапазона [1-99]")
        );
    }

    static Stream<Arguments> checkNumberIsPrimeTest_NOMINAL() {
        return Stream.of(
                arguments(2, true),
                arguments(7, true),
                arguments(31, true),
                arguments(30, false),
                arguments(0, false),
                arguments(-5, false)
        );
    }

    static Stream<Arguments> getSquareRootTest() {
        return Stream.of(
                arguments(4, "Корень вашего числа: " + 2),
                arguments(9, "Корень вашего числа: " + 3),
                arguments(25, "Корень вашего числа: " + 5),
                arguments(0, "Корень вашего числа: " + 0),
                arguments(-4, "Число отрицательное или из него невозможно извлечь целочисленный корень"),
                arguments(8, "Число отрицательное или из него невозможно извлечь целочисленный корень")
        );
    }

    static Stream<Arguments> getFactorialTest_NOMINAL() {
        return Stream.of(
                arguments(0, "Факториал числа " + 0 + ": " + 1),
                arguments(3, "Факториал числа " + 3 + ": " + 6),
                arguments(5, "Факториал числа " + 5 + ": " + 120),
                arguments(-2, "Невозможно получить факториал отрицательного числа")
        );
    }

    static Stream<Arguments> getNumeralSumTest_NOMINAL() {
        return Stream.of(
                arguments(25, 7),
                arguments(123, 6),
                arguments(252550, 19),
                arguments(-20541, 12),
                arguments(10, 1),
                arguments(5, 5)
        );
    }

    static Stream<Arguments> getReversedNumberTest_NOMINAL() {
        return Stream.of(
                arguments(123456, 654321),
                arguments(42321, 12324),
                arguments(10, 1),
                arguments(40, 4),
                arguments(5, 5),
                arguments(-5, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getEvenSumNumberTest_NOMINAL")
    void getEvenSumNumberTest(int count, String expected) {
        String actual = cycles.getEvenSumNumber(count);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("checkNumberIsPrimeTest_NOMINAL")
    void checkNumberIsPrimeTest(int number, boolean expected) {
        boolean actual = cycles.checkNumberIsPrime(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getSquareRootTest")
    void getSquareRootSequenceTest(int number, String expected) {
        String actual = cycles.getSquareRootSequence(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getSquareRootTest")
    void getSquareRootBinaryTest(int number, String expected) {
        String actual = cycles.getSquareRootBinary(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getFactorialTest_NOMINAL")
    void getFactorialTest(int number, String expected) {
        String actual = cycles.getFactorial(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getNumeralSumTest_NOMINAL")
    void getNumeralSumTest(int number, int expected) {
        int actual = cycles.getNumeralSum(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getReversedNumberTest_NOMINAL")
    void getReversedNumberTest(int number, int expected) {
        int actual = cycles.getReversedNumber(number);
        Assertions.assertEquals(expected, actual);
    }
}