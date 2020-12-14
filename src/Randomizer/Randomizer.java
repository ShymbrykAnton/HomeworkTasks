package Randomizer;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    // два исключения вводимое не того типа что нужно
    // пользователь нверено написал комманду
    // учесть числа с плавающей точкой
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int min, max, count;
    int[] array = new int[max - min + 1];

    //проверка
    public void start() {
        System.out.println("Добро пожаловать в рандомайзер.");
        System.out.println("Введите минимальное число диапазона (От 1 до 500)");
//        try {
            min = scanner.nextInt();
//        } catch (InputMismatchException exception) {
//            System.out.println("Введенные вами символы  - не цифры");
//            System.exit(0);
//        }
        if (min <= 0) {
            System.out.println("Минимальное число диапазона не может быть меньше нуля или равным ему");
            start();
        }
        if (min > 500) {
            System.out.println("Минимальное число диапазона не может быть больше 500");
            start();
        }
        System.out.println("Введите максимальное число диапазона (От минимального числа до 500)");
        max = scanner.nextInt();
        if (max > 500) {
            System.out.println("Максимальное число не может быть больше 500");
            start();
        }
        if (min > max) {
            System.out.println("Максимальное число не может быть меньше минимального");
            start();
        }
        array = new int[max - min + 1];
        count = 0;
        menu();
    }

    public void menu() {
        System.out.println("                         Главное меню");
        System.out.println("Введите одну из трех доступных комманд: \"generate\", \"help\", \"exit\"");
        scanner.nextLine();
        while (true) {
            String userCommand = scanner.nextLine();
            if (userCommand.equalsIgnoreCase("generate")) {
                generate();
            } else if (userCommand.equalsIgnoreCase("help")) {
                help();
            } else if (userCommand.equalsIgnoreCase("exit")) {
                exit();
            } else {
                System.out.println("Ваша комманда не совпадает с существующими, пожалуйста перепечатайте");
                menu();
            }
        }
    }

    public void generate() {
        if (array.length == count) {
            System.out.println("Все доступные уникальные числа в данном диапазоне закончились\n");
            menu();
        }
        while (true) {
            int randomValue = random.nextInt((max - min) + 1) + min;
            if (array[randomValue - min] == 0) {
                array[randomValue - min] = randomValue;
                System.out.println(randomValue);
                count++;
                break;
            }
        }
    }

    public void exit() {
        System.out.println("Вы правда хотите выйти? (Yes/No)");
        String userCommand = scanner.nextLine();
        if (userCommand.equalsIgnoreCase("Yes")) {
            System.exit(0);
        }
        if (userCommand.equalsIgnoreCase("No")) {
            menu();
        }
    }

    public void help() {
        System.out.println("\nДанная консольная программа предназначена для генерирования случайных, неповторяющихся чисел.");
        System.out.println("Генерация происходит в задаваемом вами диапазоне от минимального до максимального");
        System.out.println("Описание доступных комманд:");
        System.out.println("generate - сгенерировать случайное уникальное (не повторяющееся) число в задаваемом вами диапазоне");
        System.out.println("exit - выход из программы\n");
        menu();
    }
}