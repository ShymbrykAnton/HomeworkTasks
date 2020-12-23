package hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CyclesTest {
    Cycles cycles = new Cycles();

    @Test
    void getEvenSumNumber_STANDART() {
        String expected = "Колличество четных чисел: " + 5 + "\nСумма четных чисел: " + 30;
        String actual = cycles.getEvenSumNumber(10);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getEvenSumNumber_UNDER_RANGE() {
        String expected = "Ваше число выходит за рамки допустимого диапазона [1-99]";
        String actual = cycles.getEvenSumNumber(0);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getEvenSumNumber_OVER_RANGE() {
        String expected = "Ваше число выходит за рамки допустимого диапазона [1-99]";
        String actual = cycles.getEvenSumNumber(100);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkNumberIsPrime_UNDER_RANGE() {
        String expected = "Вы ввели число меньше или равное единице. Такие числа не являються простыми";
        String actual = cycles.checkNumberIsPrime(1);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void checkNumberIsPrime_PRIME_NUMBER() {
        String expected = "Вы ввели простое число: " + 197;
        String actual = cycles.checkNumberIsPrime(197);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void checkNumberIsPrime_NOT_PRIME_NUMBER() {
        String expected = "Вы ввели не простое число: " + 198;
        String actual = cycles.checkNumberIsPrime(198);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getSquareRootSequence_ZERO() {
        String expected = "Вы ввели неккоректное значение";
        String actual = cycles.getSquareRootSequence(0);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getSquareRootSequence_STANDART() {
        String expected = "Корень вашего числа: " + 5;
        String actual = cycles.getSquareRootSequence(25);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getSquareRootSequence_NOT_INTEGER() {
        String expected = "Из числа невозможно извлечь целочисленный корень";
        String actual = cycles.getSquareRootSequence(8);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getSquareRootBinary_ZERO() {
        String expected = "Корень вашего числа: " + 1;
        String actual = cycles.getSquareRootBinary(1);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getSquareRootBinary_NEGATIVE_NUMBER() {
        String expected = "Невозможно извлечь корень из отрицательного числа";
        String actual = cycles.getSquareRootBinary(-25);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getSquareRootBinary_STANDART() {
        String expected = "Корень вашего числа: " + 5;
        String actual = cycles.getSquareRootBinary(25);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getSquareRootBinary_NOT_INTEGER() {
        String expected = "Из числа невозможно извлечь целочисленный корень";
        String actual = cycles.getSquareRootBinary(8);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getFactorial_ZERO() {
        String expected = "Факториал числа " + 0 + ": " + 1;
        String actual = cycles.getFactorial(0);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getFactorial_STANDART() {
        String expected = "Факториал числа " + 7 + ": " + 5040;
        String actual = cycles.getFactorial(7);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getFactorial_NO_FACTORIAL() {
        String expected = "Невозможно получить факториал отрицательного числа";
        String actual = cycles.getFactorial(-5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getNumeralSum_STANDART() {
        String expected = "Ваше число:" + 55 + "\nСумма цифр вашего числа: " + 10;
        String actual = cycles.getNumeralSum(55);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getNumeralSum_NEGATIVE_NUMBER() {
        String expected = "Ваше число:" + -5512 + "\nСумма цифр вашего числа: " + 13;
        String actual = cycles.getNumeralSum(-5512);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getNumeralSum_ONE_NUMBER() {
        String expected = "Сумма цифр вашего числа: " + 5;
        String actual = cycles.getNumeralSum(5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getReversedNumber_STANDART() {
        String expected = "Ваше число:" + 123456 + "\nОтзеркаленное число: " + 654321;
        String actual = cycles.getReversedNumber(123456);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getReversedNumber_NEGATIVE_NUMBER() {
        String expected = "Ваше число:" + -123456 + "\nОтзеркаленное число: " + -654321;
        String actual = cycles.getReversedNumber(-123456);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getReversedNumber_ONE_NUMBER() {
        String expected = "Ваше число:" + 123456 + "\nОтзеркаленное число: " + 654321;
        String actual = cycles.getReversedNumber(123456);
        Assertions.assertEquals(expected,actual);
    }
}