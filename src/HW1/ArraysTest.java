package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArraysTest {
    Arrays arrays = new Arrays();
    static int[] array1 = new int[]{-8, 0, 1, -123, 8, 9, 10};
    static int[] array2 = new int[]{23, 0, 1, 6, 8, 9, 1050};
    static int[] array3 = new int[]{125, 160, 50, 50, 523, 25};
    static int[] array4 = new int[]{-293};
    static int[] array5 = new int[]{};


    static Stream<Arguments> getMinElementInArrayTest_NOMINAL() {
        return Stream.of(
                arguments(array1, -123),
                arguments(array2, 0),
                arguments(array3, 25),
                arguments(array4, -293),
                arguments(array5, 0)
        );
    }

    static Stream<Arguments> getMaxElementInArrayTest_NOMINAL() {
        return Stream.of(
                arguments(array1, 10),
                arguments(array2, 1050),
                arguments(array3, 523),
                arguments(array4, -293),
                arguments(array5, 0)
        );
    }

    static Stream<Arguments> getMinElementIndexTest_NOMINAL() {
        return Stream.of(
                arguments(array1, 3),
                arguments(array2, 1),
                arguments(array3, 5),
                arguments(array4, 0),
                arguments(array5, 0)
        );
    }

    static Stream<Arguments> getMaxElementIndexTest_NOMINAL() {
        return Stream.of(
                arguments(array1, 6),
                arguments(array2, 6),
                arguments(array3, 4),
                arguments(array4, 0),
                arguments(array5, 0)
        );
    }

    static Stream<Arguments> getSumNotEvenIndexElementTest_NOMINAL() {
        return Stream.of(
                arguments(array1, -113),
                arguments(array2, 33),
                arguments(array3, 673),
                arguments(array4, -293),
                arguments(array5, 0)
        );
    }

    static Stream<Arguments> countNotEvenElementInArrayTest_NOMINAL() {
        return Stream.of(
                arguments(array1, 3),
                arguments(array2, 3),
                arguments(array3, 3),
                arguments(array4, 1),
                arguments(array5, 0)
        );
    }

    static Stream<Arguments> reverseArrayTest_NOMINAL() {
        return Stream.of(
                arguments(array1, "10 9 8 1 0 -8 -123 "),
                arguments(array2, "1050 23 9 8 6 1 0 "),
                arguments(array3, "50 160 125 25 523 50 "),
                arguments(array4, "-293 "),
                arguments(array5, null)
        );
    }

    static Stream<Arguments> swapFirstAndSecondPartOfArrayTest_NOMINAL() {
        return Stream.of(
                arguments(array1, "8 9 10 -123 -8 0 1 "),
                arguments(array2, "8 9 1050 6 23 0 1 "),
                arguments(array3, "50 523 25 125 160 50 "),
                arguments(array4, "-293 "),
                arguments(array5, null)
        );
    }

    static Stream<Arguments> sortTest_NOMINAL() {
        return Stream.of(
                arguments(array1, "-123 -8 0 1 8 9 10 "),
                arguments(array2, "0 1 6 8 9 23 1050 "),
                arguments(new int[]{5, 2, 3, 4, 2, 5, 1, 7}, "1 2 2 3 4 5 5 7 "),
                arguments(array4, "-293 "),
                arguments(array5, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinElementInArrayTest_NOMINAL")
    void getMinElementInArrayTest(int[] array, int expected) {
        int actual = arrays.getMinElementInArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getMaxElementInArrayTest_NOMINAL")
    void getMaxElementInArrayTest(int[] array, int expected) {
        int actual = arrays.getMaxElementInArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getMinElementIndexTest_NOMINAL")
    void getMinElementIndexTest(int[] array, int expected) {
        int actual = arrays.getMinElementIndex(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getMaxElementIndexTest_NOMINAL")
    void getMaxElementIndexTest(int[] array, int expected) {
        int actual = arrays.getMaxElementIndex(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getSumNotEvenIndexElementTest_NOMINAL")
    void getSumNotEvenIndexElementTest(int[] array, int expected) {
        int actual = arrays.getSumNotEvenIndexElement(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("countNotEvenElementInArrayTest_NOMINAL")
    void countNotEvenElementInArrayTest(int[] array, int expected) {
        int actual = arrays.countNotEvenElementInArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("reverseArrayTest_NOMINAL")
    void reverseArrayTest(int[] array, String expected) {
        String actual = arrays.reverseArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("swapFirstAndSecondPartOfArrayTest_NOMINAL")
    void swapFirstAndSecondPartOfArrayTest(int[] array, String expected) {
        String actual = arrays.swapFirstAndSecondPartOfArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("sortTest_NOMINAL")
    void bubbleSortTest(int[] array, String expected) {
        String actual = arrays.bubbleSort(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("sortTest_NOMINAL")
    void selectSortTest(int[] array, String expected) {
        String actual = arrays.selectSort(array);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("sortTest_NOMINAL")
    void insertSortTest(int[] array, String expected) {
        String actual = arrays.insertSort(array);
        Assertions.assertEquals(expected, actual);
    }

}
