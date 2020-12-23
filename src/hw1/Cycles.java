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

    public String getSquareRootSequence(int number) {
        if (number <= 0) {
            return "Вы ввели неккоректное значение";
        }
        for (int i = 0; i <= number; i++) {
            if (number == i * i) {
                return "Корень вашего числа: " + i;
            }
        }
        return "Из числа невозможно извлечь целочисленный корень";
    }

    public String getSquareRootBinary(int number) {
        int start = 1;
        int end = number/2;
        int mid = start + (end - start) / 2;
        if (number < 0) {
            return "Невозможно извлечь корень из отрицательного числа";
        }
        if (number == 0 || number == 1) {
            return "Корень вашего числа: " + number;
        }
        for (int i = 0, k = mid; i <= mid || k <= end; i++, k++) {
            if (number == i * i) {
                return "Корень вашего числа: " + i;
            }
            if (number == k * k) {
                return "Корень вашего числа: " + k;
            }
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
        return "Факториал числа " + number + ": " + result;
    }

    public String getNumeralSum(int number) {
        int numSum, x, compareNumber = number;
        if (number < 0) {
            number *= -1;
        }
        if (number / 10 == 0) {
            return "Сумма цифр вашего числа: " + number;
        }
        for (numSum = 0; number > 0; ) {
            x = number % 10;
            number /= 10;
            numSum += x;
        }
        return "Ваше число:" + compareNumber + "\nСумма цифр вашего числа: " + numSum;
    }

    public String getReversedNumber(int number) {
        int result, i, compareNumber = number;
        if (number < 0) {
            number *= -1;
        }
        for (result = 0; number > 0; ) {
            i = number % 10;
            number /= 10;
            result *= 10;
            result += i;
        }
        if (compareNumber < 0) {
            result *= -1;
        }
        return "Ваше число:" + compareNumber + "\nОтзеркаленное число: " + result;
    }
}
