package GuessNumber;


import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int randomValue;
    int tryingGuess;
    String userCommand;
    int tryNumber = 5;
    int min = 1;
    int max = 100;

    public void start() {
        System.out.println("Добро пожаловать в \"угадай число\"");
        System.out.println("Если вы хотите использовать стандартные настройки (число генерируеться от 1 до 100, 5 попыток), то вам нужно ввести \"continue\"");
        System.out.println("Если же вы хотите вручную задать диапазон и количество попыток, то вам нужно ввести \"options\"");

        userCommand = scanner.nextLine();
        if (userCommand.equalsIgnoreCase("continue")) {
            generateNumber();
        } else if (userCommand.equalsIgnoreCase("options")) {
            options();
        } else {
            System.out.println("Комманда введена некоректно. Попробуйте ещё раз");
            start();
        }
        System.out.println("Число было сгенерировано");
        System.out.println("Вводите числа чтобы угадать его");
        guessNumber();
    }

    public void generateNumber() {
        randomValue = random.nextInt((max - min) + 1) + min;
        // не забыть убрать
        System.out.println(randomValue);
        System.out.println("Число было сгенерировано");
        System.out.println("Ещё раз привет, я загадал число от " + min + " до " + max + ". Попробуй угадать его за " + tryNumber + " попыток! Удачи)");
        guessNumber();
    }

    public void guessNumber() {
        for (int tryCounter = 0; tryCounter < tryNumber; tryCounter++) {
            tryingGuess = scanner.nextInt();
            if (tryingGuess == randomValue) {
                System.out.println("Поздравляю, вы угадали число за"+ tryCounter+" попыток");
                exit();
            } else if (tryingGuess >= randomValue - 5 && tryingGuess <= randomValue + 5) {
                System.out.println("Жарко");
            } else if (tryingGuess >= randomValue - 15 && tryingGuess <= randomValue + 15) {
                System.out.println("Тепло");
            } else if (tryingGuess <= randomValue - 16 || tryingGuess >= randomValue + 16) {
                System.out.println("Прохладно");
            } else if (tryingGuess == )
        }
        System.out.println("Колличество попыток закончилось");
        exit();
    }

    public void exit() {
        System.out.println("Хотите ли вы завершить роботу программы? (Yes(выход)/No(перезапуск программы)");
        scanner.nextLine();
        String userCommand = scanner.nextLine();
        if (userCommand.equalsIgnoreCase("Yes")) {
            System.out.println("Надеюсь вы ещё вернетесь)");
            System.exit(0);
        }
        if (userCommand.equalsIgnoreCase("No")) {
            System.out.println("Выполнен перезапуск программы\n");
            start();
        }
    }

    public void options() {
        System.out.println("Введите начало диапазона угадывания чисел (от 1 до 200)");
        min = scanner.nextInt();
        if (min > 200 || min < 1) {
            System.out.println("Некоректное значение начала диапазона, попробуйте ещё раз");
            options();
        }
        System.out.println("Введите конец диапазона угадывания чисел (от начала диапазона до 200)");
        max = scanner.nextInt();
        if (max < min || max > 200) {
            System.out.println("Некоректное значение конца диапазона, попробуйте ещё раз");
            options();
        }
        System.out.println("Введите количество попыток (от 1 до 15), которое вам необходимо для угадывания");
        tryNumber = scanner.nextInt();
        if (tryNumber < 1 || tryNumber > 15) {
            System.out.println("Некоректное значение колличества попыток, попробуйте ещё раз");
            options();
        }
        generateNumber();
    }
}
