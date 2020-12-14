package hw1;

public class Cycles {
    public String getEvenSumNumber(int count) {
        if (count < 1 || count > 99) {
            return "Ваше число выходит за рамки допустимого диапазона [1-99]";
        } else {
            int i, summa, number;
            for (i = 2, summa = 0, number = 0; i <= count; i += 2) {
                number += 1;
                summa += i;
            }
            return "Колличество четных чисел: " + number + "\nСумма четных чисел: " + summa;
        }
    }

    public String checkNumberIsPrime(int number) {
        if (number < 2) {
            return "Вы ввели число меньше или равное единице. Такие числа не являються простыми";
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "Вы ввели не простое число: " + number;
            }
        }
        return "Вы ввели простое число: " + number;
    }

    //3.	Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)
    // как реализовать метод бинарного поиска здесь
    public String getSquareRoot(int number) {
        if (number <= 0) {
            return "Вы ввели неккоректное значение";
        }
        int rootSequence = 0;
        for (double i = 1.0; i <= number; i += 0.1) {
            if (number == i * i) {
                rootSequence = (int) i;
            }
            return "Корень вашего числа: " + rootSequence;
        }

        return "Из числа невозможно извлечь целочисленный корень";
    }

    public String getFactorial(int number) {
        int result, i;
        if (number < 0) {
            return "Невозможно получить факториал отрицательного числа";
        }
        for (i = 1, result = 1; i <= number; i++) {
            result *= i;
        }
        return "Факториал числа n: " + result;
    }

    public String getNumeralSum(int number) {
        int numsum, x, compareNumber = number;
        if (number < 0) {
            number += 2 * (-number);
            System.out.println("Отрицательность вашего числа учитываться при вычислении не будет");
        }
        for (x = 0, numsum = 0; number > 0; ) {
            x = number % 10;
            number /= 10;
            numsum += x;
        }
        return "Ваше число:" + compareNumber + "\nСумма цифр вашего числа: " + numsum;
    }

    public String getReversedNumber(int number) {
        int result, i, compareNumber = number;
        if (number < 0) {
            number += 2 * (-number);
            System.out.println("Отрицательность вашего числа учитываться при вычислении не будет");
        }
        for (result = 0; number > 0; ) {
            i = number % 10;
            number /= 10;
            result *= 10;
            result += i;
        }
        return "Ваше число:" + compareNumber + "\nОтзеркаленное число: " + result;
    }
}
