package Check;

import GuessNumber.GuessNumber;
import HW1.Arrays;
import HW1.Functions;
import HW3.UseMath;
import Randomizer.Randomizer;
import Stars.DrawingStars;

public class Main {
    public static void main(String[] args) {
//        ConditionalOperators operators = new ConditionalOperators();
//        String result1 = operators.getMarkByRating(83);
//        System.out.println("Результат: " + result1);
//
//        Cycles cycles = new Cycles();
//        String result2 = cycles.getSquareRoot(9);
//        System.out.println(result2);
//
//        Arrays arrays = new Arrays();
//        int[] array = {-9, 7, -6, 4, -5, 2, -3, 1,0,1, -8, 10};
//        String result3 = arrays.insertSort(array);
//        System.out.println(result3);
//
//        Randomizer randomizer = new Randomizer();
//        randomizer.start();

//        GuessNumber guessNumber = new GuessNumber(5, 1, 100);
//        guessNumber.start();

//        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
//        randomNumberGenerator.getRandomTimesRandomValues();

//        DrawingStars drawingStars = new DrawingStars();
//        drawingStars.drawSquare();
//        System.out.println();
//        drawingStars.drawEmptySquare();
//        System.out.println();
//        drawingStars.drawLeftBottomTriangle();
//        System.out.println();
//        drawingStars.drawLeftTopTriangle();
//        System.out.println();
//        drawingStars.drawRightTopTriangle();
//        System.out.println();
//        drawingStars.drawRightBottomTriangle();
//        System.out.println();
//        drawingStars.drawX();
//        System.out.println();
//        drawingStars.drawTopTriangle();
//        System.out.println();
//        drawingStars.drawBottomTriangle();

//        UseMath useMath = new UseMath();
//        boolean result = useMath.isDotInsideArea(-0.25,0.5);
//        System.out.println(result);
        Functions functions = new Functions();
        String result = functions.getStringFromNumber(150);
        System.out.println(result);
    }
}

