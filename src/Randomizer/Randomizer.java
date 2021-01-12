package Randomizer;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private String userCommand;
    private int min;
    private int max;
    private int count;
    private int[] array = new int[max - min + 1];

    public void start() {
        System.out.println("Добро пожаловать в рандомайзер.");
        System.out.println("Введите минимальное число диапазона (От 1 до 500):");
        final String INCORRECT_INPUT = "Введенные вами цифры не цифры или минимальное число выходит за пределы допустимого диапазона\n" +
                "(от 1 до 500) или максимальное число выходит за пределы диапазона (от минимального до 500).\n";
        try {
            min = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println(INCORRECT_INPUT);
            System.exit(0);
        }
        if (min <= 0) {
            System.out.println(INCORRECT_INPUT);
            start();
        }
        if (min > 500) {
            System.out.println(INCORRECT_INPUT);
            start();
        }
        System.out.println("Введите максимальное число диапазона (От минимального числа до 500):");
        try {
            max = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println(INCORRECT_INPUT);
            System.exit(0);
        }
        if (max > 500) {
            System.out.println(INCORRECT_INPUT);
            start();
        }
        if (min > max) {
            System.out.println(INCORRECT_INPUT);
            start();
        }
        array = new int[max - min + 1];
        count = 0;
        System.out.println("                         Главное меню");
        System.out.println("Введите одну из трех доступных комманд: \"generate\", \"help\", \"exit\"");
        menu();
    }

    public void menu() {
        switch (userCommand = scanner.nextLine()) {
            case "generate":
                generate();
                break;
            case "help":
                help();
                break;
            case "exit":
                exit();
                break;
            default:
                menu();
                break;
        }
    }


    public void generate() {
        if (array.length == count) {
            System.out.print("Все доступные уникальные числа в данном диапазоне закончились\n");
            exit();
        }
        boolean isPlaceForNumber = true;
        while (isPlaceForNumber) {
            int randomValue = random.nextInt((max - min) + 1) + min;
            if (array[randomValue - min] == 0) {
                array[randomValue - min] = randomValue;
                System.out.println(randomValue);
                count++;
                menu();
                isPlaceForNumber = false;
            }
        }
    }

    public void exit() {
        System.out.println("Вы хотите завершить работу программы? Yes (выход из программы) / No (перезапуск программы)");
        userCommand = scanner.nextLine();
        if (userCommand.equalsIgnoreCase("Yes")) {
            System.out.println("До новых встреч!");
            System.exit(0);
        }
        if (userCommand.equalsIgnoreCase("No")) {
            start();
        }
    }

    public void help() {
        System.out.println("\nДанная консольная программа предназначена для генерирования случайных, неповторяющихся чисел.\n" +
                "Генерация происходит в задаваемом вами диапазоне от минимального до максимального.\n" +
                "Описание доступных комманд:\n" +
                "generate - сгенерировать случайное уникальное (не повторяющееся) число в задаваемом вами диапазоне\n" +
                "exit - выход из программы\n");
        menu();
    }
}