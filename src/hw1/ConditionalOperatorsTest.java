package hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionalOperatorsTest {
    ConditionalOperators conditionalOperators = new ConditionalOperators();

    @Test
    void getSumOrMultiply_NOT_EVEN() {
        String expected = "Число а - нечетное: 15";
        String actual = conditionalOperators.getSumOrMultiply(5, 10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSumOrMultiply_EVEN() {
        String expected1 = "Число а - четное: 60";
        String actual1 = conditionalOperators.getSumOrMultiply(6, 10);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void findQuarterByCoordinates_FIRST_QUTER() {
        String expected = "Точка принадлежит первой четверти";
        String actual = conditionalOperators.findQuarterByCoordinates(5, 5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findQuarterByCoordinates_FOURTH_QUATER() {
        String expected1 = "Точка принадлежит четвертой четверти";
        String actual1 = conditionalOperators.findQuarterByCoordinates(6, -10);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void findQuarterByCoordinates_SECOND_QUATER() {
        String expected2 = "Точка принадлежит второй четверти";
        String actual2 = conditionalOperators.findQuarterByCoordinates(-5, 10);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void findQuarterByCoordinates_THIRD_QUATER() {
        String expected3 = "Точка принадлежит третьей четверти";
        String actual3 = conditionalOperators.findQuarterByCoordinates(-5, -10);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void findQuarterByCoordinates_FIRST_AND_SECOND_QUATER() {
        String expected4 = "Точка принадлежит первой и второй четверти";
        String actual4 = conditionalOperators.findQuarterByCoordinates(0, 11);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    void findQuarterByCoordinates__THIRD_AND_FOURTH_QUATER() {
        String expected5 = "Точка принадлежит третьей четвертой четверти";
        String actual5 = conditionalOperators.findQuarterByCoordinates(0, -10);
        Assertions.assertEquals(expected5, actual5);
    }

    @Test
    void findQuarterByCoordinates_FIRST_AND_FOURTH_QUATER() {
        String expected6 = "Точка принадлежит первой и четвертой четверти";
        String actual6 = conditionalOperators.findQuarterByCoordinates(5, 0);
        Assertions.assertEquals(expected6, actual6);
    }

    @Test
    void findQuarterByCoordinates_SECOND_AND_THIRD_QUATER() {
        String expected7 = "Точка принадлежит второй и третьей четверти";
        String actual7 = conditionalOperators.findQuarterByCoordinates(-5, 0);
        Assertions.assertEquals(expected7, actual7);
    }

    @Test
    void findQuarterByCoordinates_START_COORDINATES() {
        String expected8 = "Точка лежит в начале координат";
        String actual8 = conditionalOperators.findQuarterByCoordinates(0, 0);
        Assertions.assertEquals(expected8, actual8);
    }

    @Test
    void getOnlyPositiveNumberSum_ALL_ARE_POSITIVE() {
        String expected1 = "Сумма положительных из трех чисел: 30";
        String actual1 = conditionalOperators.getOnlyPositiveNumberSum(5, 10, 15);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void getOnlyPositiveNumberSum_FIRST_IS_NEGATIVE() {
        String expected2 = "Сумма положительных из трех чисел: 25";
        String actual2 = conditionalOperators.getOnlyPositiveNumberSum(-5, 10, 15);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void getOnlyPositiveNumberSum_SECOND_IS_NEGATIVE() {
        String expected3 = "Сумма положительных из трех чисел: 20";
        String actual3 = conditionalOperators.getOnlyPositiveNumberSum(5, -10, 15);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void getOnlyPositiveNumberSum_THIRD_IS_NEGATIVE() {
        String expected4 = "Сумма положительных из трех чисел: 15";
        String actual4 = conditionalOperators.getOnlyPositiveNumberSum(5, 10, -15);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    void getOnlyPositiveNumberSum_ALL_ARE_NEGATIVE() {
        String expected8 = "Сумма положительных из трех чисел: 0";
        String actual8 = conditionalOperators.getOnlyPositiveNumberSum(-5, -10, -15);
        Assertions.assertEquals(expected8, actual8);
    }

    @Test
    void getMaxMultiplyOrSumPlusThree_MULTIPLY_EQUALS_SUM() {
        String expected1 = "Результат умножения чисел равен результату суммирования: 9";
        String actual1 = conditionalOperators.getMaxMultiplyOrSumPlusThree(1, 2, 3);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void getMaxMultiplyOrSumPlusThree_MULTIPLY_NUMBERS() {
        String expected3 = "Числа были перемножены +3: 128";
        String actual3 = conditionalOperators.getMaxMultiplyOrSumPlusThree(5, 5, 5);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void getMaxMultiplyOrSumPlusThree_SUM_NUMBERS() {
        String expected4 = "Числа были суммированы +3: 7";
        String actual4 = conditionalOperators.getMaxMultiplyOrSumPlusThree(1, 2, 1);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    void getMarkByRating_UNCORRECT_VALUE1() {
        String expected = "Некорректное значение, введите корректное значение в пределах [0-100]";
        String actual = conditionalOperators.getMarkByRating(-5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMarkByRating_UNCORRECT_VALUE2() {
        String expected1 = "Некорректное значение, введите корректное значение в пределах [0-100]";
        String actual1 = conditionalOperators.getMarkByRating(105);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void getMarkByRating_E_MARK() {
        String expected2 = "Ваша оценка по рейтингу: E";
        String actual2 = conditionalOperators.getMarkByRating(25);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void getMarkByRating_D_MARK() {
        String expected3 = "Ваша оценка по рейтингу: D";
        String actual3 = conditionalOperators.getMarkByRating(45);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void getMarkByRating_C_MARK() {
        String expected4 = "Ваша оценка по рейтингу: C";
        String actual4 = conditionalOperators.getMarkByRating(65);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    void getMarkByRating_B_MARK() {
        String expected5 = "Ваша оценка по рейтингу: B";
        String actual5 = conditionalOperators.getMarkByRating(85);
        Assertions.assertEquals(expected5, actual5);
    }

    @Test
    void getMarkByRating_A_MARK() {
        String expected6 = "Ваша оценка по рейтингу: A";
        String actual6 = conditionalOperators.getMarkByRating(95);
        Assertions.assertEquals(expected6, actual6);
    }

    @Test
    void getMarkByRating_F_MARK() {
        String expected7 = "Ваша оценка по рейтингу: F";
        String actual7 = conditionalOperators.getMarkByRating(5);
        Assertions.assertEquals(expected7, actual7);
    }
}
