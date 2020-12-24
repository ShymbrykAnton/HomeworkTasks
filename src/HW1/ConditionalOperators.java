package HW1;

public class ConditionalOperators {
    public String getSumOrMultiply(int a, int b) {
        if (a % 2 == 0) {
            return "Число а - четное: " + (a * b);
        }
        return "Число а - нечетное: " + (a + b);
    }

    public String findQuarterByCoordinates(int x, int y) {
        if (x > 0) {
            if (y > 0) {
                return "Точка принадлежит первой четверти";
            }
            if (y < 0) {
                return "Точка принадлежит четвертой четверти";
            }
        }
        if (x < 0) {
            if (y > 0) {
                return "Точка принадлежит второй четверти";
            }
            if (y < 0) {
                return "Точка принадлежит третьей четверти";
            }
        }
        if (x == 0) {
            if (y > 0) {
                return "Точка принадлежит первой и второй четверти";
            }
            if (y < 0) {
                return "Точка принадлежит третьей четвертой четверти";
            }
        }
        if (x > 0) {
            return "Точка принадлежит первой и четвертой четверти";
        }
        if (x < 0) {
            return "Точка принадлежит второй и третьей четверти";
        }
        return "Точка лежит в начале координат";
    }

    public String getOnlyPositiveNumberSum(int a, int b, int c) {
        int result = 0;
        if (a >= 0) {
            result += a;
        }
        if (b >= 0) {
            result += b;
        }
        if (c >= 0) {
            result += c;
        }
        return "Сумма положительных из трех чисел: " + result;
    }

    public String getMaxMultiplyOrSumPlusThree(int a, int b, int c) {
        int multiply = a * b * c;
        int summa = a + b + c;
        if (a * b * c == a + b + c) {
            return "Результат умножения чисел равен результату суммирования: "+ (multiply + 3);
        }
        if (multiply > summa) {
            return "Числа были перемножены +3: " + (multiply + 3);
        }
        return "Числа были суммированы +3: " + (summa + 3);
    }

    public String getMarkByRating(int rating) {
        if (rating < 0 || rating > 100) {
            return "Некорректное значение, введите корректное значение в пределах [0-100]";
        }
        String formal = "Ваша оценка по рейтингу: ";
        if (rating <= 19) {
            return formal + "F";
        }
        if (rating <= 39) {
            return formal + "E";
        }
        if (rating <= 59) {
            return formal + "D";
        }
        if (rating <= 74) {
            return formal + "C";
        }
        if (rating <= 89) {
            return formal + "B";
        } else {
            return formal + "A";
        }
    }
}

