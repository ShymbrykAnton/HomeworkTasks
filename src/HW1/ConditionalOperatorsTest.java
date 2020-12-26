package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConditionalOperatorsTest {
    ConditionalOperators conditionalOperators = new ConditionalOperators();

    static Stream<Arguments> getSumOrMultiplyTest_NOMINAL() {
        return Stream.of(
                arguments(2, 4, "Число а - четное: 8"),
                arguments(-2, -4, "Число а - четное: 8"),
                arguments(3, 6, "Число а - нечетное: 9"),
                arguments(-3, 6, "Число а - нечетное: 3"),
                arguments(0, 0, "Число а = 0: 0")
        );
    }

    static Stream<Arguments> findQuarterByCoordinatesTest_NOMINAL() {
        String formal = "Точка принадлежит следующим(ей) четвертям(и): ";
        return Stream.of(
                arguments(1, 2, formal + "первой"),
                arguments(-1, 2, formal + "второй"),
                arguments(-1, -2, formal + "третьей"),
                arguments(1, -2, formal + "четвертой"),
                arguments(0, 2, formal + "первой и второй"),
                arguments(0, -2, formal + "третьей и четвертой"),
                arguments(1, 0, formal + "первой и четвертой"),
                arguments(-1, 0, formal + "второй и третьей"),
                arguments(0, 0, "Точка лежит в начале координат")
        );
    }

    static Stream<Arguments> getOnlyPositiveNumberSumTest_NOMINAL() {
        return Stream.of(
                arguments(1, 2, 3, 6),
                arguments(-1, 2, 3, 5),
                arguments(1, -2, 3, 4),
                arguments(1, 2, -3, 3),
                arguments(-1, -2, 3, 3),
                arguments(-1, 2, -3, 2),
                arguments(1, -2, -3, 1),
                arguments(0, 0, 0, 0),
                arguments(0, 1, 0, 1)
        );
    }

    static Stream<Arguments> getMaxMultiplyOrSumPlusThreeTest_NOMINAL() {
        return Stream.of(
                arguments(1, 2, 3, 9),
                arguments(-1, 2, 3, 7),
                arguments(-1, -2, 3, 9),
                arguments(2, 0, -3, 3),
                arguments(2, 0, 3, 8),
                arguments(1, 1, 1, 6),
                arguments(-0, 0, 0, 3)
        );
    }

    static Stream<Arguments> getMarkByRatingTest_NOMINAL() {
        String formal = "Ваша оценка по рейтингу: ";
        return Stream.of(
                arguments(0, formal + "F"),
                arguments(20, formal + "E"),
                arguments(40, formal + "D"),
                arguments(60, formal + "C"),
                arguments(75, formal + "B"),
                arguments(90, formal + "A"),
                arguments(-5, "Некорректное значение, введите корректное значение в пределах [0-100]"),
                arguments(105, "Некорректное значение, введите корректное значение в пределах [0-100]")
        );
    }

    @ParameterizedTest
    @MethodSource("getSumOrMultiplyTest_NOMINAL")
    void getSumOrMultiplyTest(int a, int b, String expected) {
        String actual = conditionalOperators.getSumOrMultiply(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("findQuarterByCoordinatesTest_NOMINAL")
    void findQuarterByCoordinatesTest(int a, int b, String expected) {
        String actual = conditionalOperators.findQuarterByCoordinates(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getOnlyPositiveNumberSumTest_NOMINAL")
    void getOnlyPositiveNumberSumTest(int a, int b, int c, int expected) {
        int actual = conditionalOperators.getOnlyPositiveNumberSum(a, b, c);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getMaxMultiplyOrSumPlusThreeTest_NOMINAL")
    void getMaxMultiplyOrSumPlusThreeTest(int a, int b, int c, int expected) {
        int actual = conditionalOperators.getMaxMultiplyOrSumPlusThree(a, b, c);
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @MethodSource("getMarkByRatingTest_NOMINAL")
    void getMarkByRatingTest(int mark, String expected) {
        String actual = conditionalOperators.getMarkByRating(mark);
        Assertions.assertEquals(expected, actual);
    }
}
