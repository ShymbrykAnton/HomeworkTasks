package HW1;

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

    public boolean checkNumberIsPrime(int number) {
        if (number < 2) {
            return false;
        }
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String getSquareRootSequence(int number) {
        if (number < 0) {
            return "Невозможно извлечь корень из отрицательного числа";
        }
        int i;
        for (i = 0; i <= number; i++) {
            if (number == i * i) {
                return "Корень вашего числа: " + i;
            }
        }
        return "Из числа невозможно извлечь целочисленный корень";
    }

    public String getSquareRootBinary(int number) {
        if (number < 0) {
            return "Невозможно извлечь корень из отрицательного числа";
        }
        if (number == 0 || number == 1) {
            return "Корень вашего числа: " + number;
        }
        int i, k, end, mid, start;
        for (i = 0, start = 1, end = number / 2, mid = start + (end - start) / 2, k = mid; i <= mid || k <= end; i++, k++) {
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
        if (number < 0) {
            return "Невозможно получить факториал отрицательного числа";
        }
        int result, i;
        for (i = 1, result = 1; i <= number; i++) {
            result *= i;
        }
        return "Факториал числа " + number + ": " + result;
    }

    public int getNumeralSum(int number) {
        if (number / 10 == 0) {
            return number;
        }
        if (number < 0) {
            number *= -1;
        }
        int numSum, x;
        for (numSum = 0; number > 0; ) {
            x = number % 10;
            number /= 10;
            numSum += x;
        }
        return numSum;
    }

    public int getReversedNumber(int number) {
        if (number < 0) {
            number *= -1;
        }
        int result, i;
        for (result = 0; number > 0; ) {
            i = number % 10;
            number /= 10;
            result *= 10;
            result += i;
        }
        return result;
    }
}
