package hw1Test;

import hw1.ConditionalOperators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionalOperatorsTest {
    ConditionalOperators conditionalOperators = new ConditionalOperators();

    @Test
    void getSumOrMultiply() {
        String expected = "Число а - нечетное: 15";
        String actual = conditionalOperators.getSumOrMultiply(5, 10);
        Assertions.assertEquals(expected, actual);

        String expected1 = "Число а - четное: 60";
        String actual1 = conditionalOperators.getSumOrMultiply(6, 10);
        Assertions.assertEquals(expected1, actual1);

        String expected2 = "Число а - четное: 0";
        String actual2 = conditionalOperators.getSumOrMultiply(0, 10);
        Assertions.assertEquals(expected2, actual2);

        String expected3 = "Число а - нечетное: 5";
        String actual3 = conditionalOperators.getSumOrMultiply(-5, 10);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void findQuarterByCoordinates() {
        String expected = "Точка принадлежит первой четверти";
        String actual = conditionalOperators.findQuarterByCoordinates(5, 5);
        Assertions.assertEquals(expected, actual);

        String expected1 = "Точка принадлежит четвертой четверти";
        String actual1 = conditionalOperators.findQuarterByCoordinates(6, -10);
        Assertions.assertEquals(expected1, actual1);

        String expected2 = "Точка принадлежит второй четверти";
        String actual2 = conditionalOperators.findQuarterByCoordinates(-5, 10);
        Assertions.assertEquals(expected2, actual2);

        String expected3 = "Точка принадлежит третьей четверти";
        String actual3 = conditionalOperators.findQuarterByCoordinates(-5, -10);
        Assertions.assertEquals(expected3, actual3);

        String expected4 = "Точка принадлежит первой и второй четверти";
        String actual4 = conditionalOperators.findQuarterByCoordinates(0, 11);
        Assertions.assertEquals(expected4, actual4);

        String expected5 = "Точка принадлежит третьей четвертой четверти";
        String actual5 = conditionalOperators.findQuarterByCoordinates(0, -10);
        Assertions.assertEquals(expected5, actual5);

        String expected6 = "Точка принадлежит первой и четвертой четверти";
        String actual6 = conditionalOperators.findQuarterByCoordinates(5, 0);
        Assertions.assertEquals(expected6, actual6);

        String expected7 = "Точка принадлежит второй и третьей четверти";
        String actual7 = conditionalOperators.findQuarterByCoordinates(-5, 0);
        Assertions.assertEquals(expected7, actual7);

        String expected8 = "Точка лежит в начале координат";
        String actual8 = conditionalOperators.findQuarterByCoordinates(0, 0);
        Assertions.assertEquals(expected8, actual8);
    }

    @Test
    void getOnlyPositiveNumberSum() {
        String expected = "Сумма положительных из трех чисел: 0";
        String actual = conditionalOperators.getOnlyPositiveNumberSum(0, 0, 0);
        Assertions.assertEquals(expected, actual);

        String expected1 = "Сумма положительных из трех чисел: 30";
        String actual1 = conditionalOperators.getOnlyPositiveNumberSum(5, 10, 15);
        Assertions.assertEquals(expected1, actual1);

        String expected2 = "Сумма положительных из трех чисел: 25";
        String actual2 = conditionalOperators.getOnlyPositiveNumberSum(-5, 10, 15);
        Assertions.assertEquals(expected2, actual2);

        String expected3 = "Сумма положительных из трех чисел: 20";
        String actual3 = conditionalOperators.getOnlyPositiveNumberSum(5, -10, 15);
        Assertions.assertEquals(expected3, actual3);

        String expected4 = "Сумма положительных из трех чисел: 15";
        String actual4 = conditionalOperators.getOnlyPositiveNumberSum(5, 10, -15);
        Assertions.assertEquals(expected4, actual4);

        String expected5 = "Сумма положительных из трех чисел: 15";
        String actual5 = conditionalOperators.getOnlyPositiveNumberSum(-5, -10, 15);
        Assertions.assertEquals(expected5, actual5);

        String expected6 = "Сумма положительных из трех чисел: 5";
        String actual6 = conditionalOperators.getOnlyPositiveNumberSum(5, -10, -15);
        Assertions.assertEquals(expected6, actual6);

        String expected7 = "Сумма положительных из трех чисел: 10";
        String actual7 = conditionalOperators.getOnlyPositiveNumberSum(-5, 10, -15);
        Assertions.assertEquals(expected7, actual7);

        String expected8 = "Сумма положительных из трех чисел: 0";
        String actual8 = conditionalOperators.getOnlyPositiveNumberSum(-5, -10, -15);
        Assertions.assertEquals(expected8, actual8);
    }

    @Test
    void getMaxMultiplyOrSumPlusThree() {
        String expected = "Результат умножения чисел равен результату суммирования: 3";
        String actual = conditionalOperators.getMaxMultiplyOrSumPlusThree(0, 0, 0);
        Assertions.assertEquals(expected, actual);

        String expected1 = "Результат умножения чисел равен результату суммирования: 9";
        String actual1 = conditionalOperators.getMaxMultiplyOrSumPlusThree(1, 2, 3);
        Assertions.assertEquals(expected1, actual1);

        String expected2 = "Результат умножения чисел равен результату суммирования: -3";
        String actual2 = conditionalOperators.getMaxMultiplyOrSumPlusThree(-1, -2, -3);
        Assertions.assertEquals(expected2, actual2);

        String expected3 = "Числа были перемножены +3: 128";
        String actual3 = conditionalOperators.getMaxMultiplyOrSumPlusThree(5, 5, 5);
        Assertions.assertEquals(expected3, actual3);

        String expected4 = "Числа были суммированы +3: 7";
        String actual4 = conditionalOperators.getMaxMultiplyOrSumPlusThree(1, 2, 1);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    void getMarkByRating() {
        String expected = "Некорректное значение, введите корректное значение в пределах [0-100]";
        String actual = conditionalOperators.getMarkByRating(-5);
        Assertions.assertEquals(expected, actual);

        String expected1 = "Некорректное значение, введите корректное значение в пределах [0-100]";
        String actual1 = conditionalOperators.getMarkByRating(105);
        Assertions.assertEquals(expected1, actual1);

        String expected2 = "Ваша оценка по рейтингу: E";
        String actual2 = conditionalOperators.getMarkByRating(25);
        Assertions.assertEquals(expected2, actual2);

        String expected3 = "Ваша оценка по рейтингу: D";
        String actual3 = conditionalOperators.getMarkByRating(45);
        Assertions.assertEquals(expected3, actual3);

        String expected4 = "Ваша оценка по рейтингу: C";
        String actual4 = conditionalOperators.getMarkByRating(65);
        Assertions.assertEquals(expected4, actual4);

        String expected5 = "Ваша оценка по рейтингу: B";
        String actual5 = conditionalOperators.getMarkByRating(85);
        Assertions.assertEquals(expected5, actual5);

        String expected6 = "Ваша оценка по рейтингу: A";
        String actual6 = conditionalOperators.getMarkByRating(95);
        Assertions.assertEquals(expected6, actual6);

        String expected7 = "Ваша оценка по рейтингу: F";
        String actual7 = conditionalOperators.getMarkByRating(5);
        Assertions.assertEquals(expected7, actual7);
    }
}
