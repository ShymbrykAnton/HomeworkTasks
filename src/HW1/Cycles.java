package HW1;

public class Cycles {
    private final String IMPOSSIBLE_TO_GET_ROOT = "Число отрицательное или из него невозможно извлечь целочисленный корень";
    private final String YOUR_ROOT = "Корень вашего числа:";

    public String getEvenSumNumber(int count) {
        if (count < 1 || count > 99) {
            return "Ваше число выходит за рамки допустимого диапазона [1-99]";
        } else {
            int i, summa, number;
            for (i = 2, summa = 0, number = 0; i <= count; i += 2) {
                number += 1;
                summa += i;
            }
            return String.format("Колличество четных чисел: %s\nСумма четных чисел: %s", number, summa);
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
            return IMPOSSIBLE_TO_GET_ROOT;
        }
        int i;
        for (i = 0; i <= number; i++) {
            if (number == i * i) {
                return String.format("%s %s", YOUR_ROOT, i);
            }
        }
        return IMPOSSIBLE_TO_GET_ROOT;
    }

    public String getSquareRootBinary(int number) {
        if (number < 0) {
            return IMPOSSIBLE_TO_GET_ROOT;
        }
        if (number == 0 || number == 1) {
            return String.format("%s %s", YOUR_ROOT, number);
        }
        int i, k, end, mid, start;
        for (i = 0, start = 1, end = number / 2, mid = start + (end - start) / 2, k = mid; i <= mid || k <= end; i++, k++) {
            if (number == i * i) {
                return String.format("%s %s", YOUR_ROOT, i);
            }
            if (number == k * k) {
                return String.format("%s %s", YOUR_ROOT, k);
            }
        }
        return IMPOSSIBLE_TO_GET_ROOT;
    }

    public String getFactorial(int number) {
        if (number < 0) {
            return "Невозможно получить факториал отрицательного числа";
        }
        int result, i;
        for (i = 1, result = 1; i <= number; i++) {
            result *= i;
        }
        return String.format("Факториал числа %s: %s", number, result);
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
