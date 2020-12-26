package HW2;

import java.util.Random;

public class RandomNumberGenerator {
    Random random = new Random();

    public void getRandomValue() {
        int randomValue;
        randomValue = random.nextInt((100 - 1) + 1) + 1;
        System.out.println("Случайное число: " + randomValue);
    }

    public void getTenTimesRandomValues() {
        int randomValue, count;
        for (count = 0; count < 10; count++) {
            randomValue = random.nextInt((100 - 1) + 1) + 1;
            System.out.println("Случайное число №" + (count + 1) + ": " + randomValue);
        }
    }

    public void getTenTimesRandomValuesFromZeroToTen() {
        int randomValue, count;
        for (count = 0; count < 10; count++) {
            randomValue = random.nextInt((10) + 1);
            System.out.println("Случайное число №" + (count + 1) + ": " + randomValue);
        }
    }

    public void getTenTimesRandomValuesFromTwentyToFifty() {
        int randomValue, count;
        for (count = 0; count < 10; count++) {
            randomValue = random.nextInt((50 - 20) + 1) + 20;
            System.out.println("Случайное число №" + (count + 1) + ": " + randomValue);
        }
    }

    public void getTenTimesRandomValuesFromMinusTenToTen() {
        int randomValue, count;
        for (count = 0; count < 10; count++) {
            randomValue = random.nextInt((20) + 1);
            randomValue -= 10;
            System.out.println("Случайное число №" + (count + 1) + ": " + randomValue);
        }
    }

    public void getRandomTimesRandomValues() {
        int randomValue, numberOfRandomNumbers, count;
        numberOfRandomNumbers = random.nextInt((10 - 3) + 1) + 3;
        for (count = 0; count < numberOfRandomNumbers; count++) {
            randomValue = random.nextInt((45) + 1);
            randomValue -= 10;
            System.out.println("Случайное число №" + (count + 1) + ": " + randomValue);
        }
    }
}
