package HW1;

public class Arrays {
    StringBuilder resultArray = new StringBuilder();

    public int getMinElementInArray(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return 0;
        }
        int i, minNumber;
        for (i = array.length - 1, minNumber = array[0]; i >= 0; i--) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public int getMaxElementInArray(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return 0;
        }
        int index, maxNumber;
        for (index = array.length - 1, maxNumber = array[0]; index >= 0; index--) {
            if (array[index] > maxNumber) {
                maxNumber = array[index];
            }
        }
        return maxNumber;
    }

    public int getMinElementIndex(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return 0;
        }
        int index, minNumber, minIndex;
        for (index = array.length - 1, minNumber = array[0], minIndex = 0; index >= 0; index--) {
            if (array[index] <= minNumber) {
                minNumber = array[index];
                minIndex = index;
            }
        }
        return minIndex;
    }

    public int getMaxElementIndex(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return 0;
        }
        int index, maxNumber, maxIndex;
        for (index = array.length - 1, maxNumber = array[0], maxIndex = 0; index >= 0; index--) {
            if (array[index] >= maxNumber) {
                maxNumber = array[index];
                maxIndex = index;
            }
        }
        return maxIndex;
    }

    public int getSumNotEvenIndexElement(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return 0;
        }
        int index, sum;
        if (array.length == 1) {
            return array[0];
        }
        for (index = 0,sum = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                sum += array[index];
            }
        }
        return sum;
    }

    public String reverseArray(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return null;
        }
        int startIndex, endIndex, rememberStart;
        for (startIndex = 0, endIndex = array.length - 1; startIndex < array.length / 2; startIndex++, endIndex--) {
            rememberStart = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = rememberStart;
        }
        for (int value : array) {
            resultArray.append(value).append(" ");
        }
        return resultArray.toString();
    }

    public int countNotEvenElementInArray(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return 0;
        }
        int index , count;
        for (index = 0, count = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public String swapFirstAndSecondPartOfArray(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return null;
        }
        int startSwapIndex, rememberStart,notEvenLength;
        for (startSwapIndex = 0,notEvenLength = array.length % 2; startSwapIndex < array.length / 2; startSwapIndex++) {
            rememberStart = array[startSwapIndex];
            array[startSwapIndex] = array[(array.length / 2) + startSwapIndex + notEvenLength];
            array[(array.length / 2) + startSwapIndex + notEvenLength] = rememberStart;
        }
        for (int value : array) {
            resultArray.append(value).append(" ");
        }
        return resultArray.toString();
    }

    public String bubbleSort(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return null;
        }
        int strCounter, rightSymbol, numberSaver;
        for (strCounter = 0; strCounter < array.length; strCounter++) {
            for (rightSymbol = 0; rightSymbol < array.length - strCounter - 1; rightSymbol++) {
                if (array[rightSymbol] > array[rightSymbol + 1]) {
                    numberSaver = array[rightSymbol + 1];
                    array[rightSymbol + 1] = array[rightSymbol];
                    array[rightSymbol] = numberSaver;
                }
            }
        }
        for (int value : array) {
            resultArray.append(value).append(" ");
        }
        return resultArray.toString();
    }

    public String selectSort(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return null;
        }
        int minElementIndex, saveNumber,strCounter,numberCounter;
        for (strCounter = 0; strCounter < array.length; strCounter++) {
            minElementIndex = strCounter;
            saveNumber = array[strCounter];
            for ( numberCounter = strCounter + 1; numberCounter < array.length; numberCounter++) {
                if (array[numberCounter] < array[minElementIndex]) {
                    minElementIndex = numberCounter;
                }
            }
            array[strCounter] = array[minElementIndex];
            array[minElementIndex] = saveNumber;
        }
        for (int value : array) {
            resultArray.append(value).append(" ");
        }
        return resultArray.toString();
    }

    public String insertSort(int[] array) {
        int[] arrayEmpty = new int[]{};
        if (java.util.Arrays.equals(array, arrayEmpty)) {
            return null;
        }
        int saveNumber, left, right;
        for ( left = 0; left < array.length; left++) {
            saveNumber = array[left];
            right = left - 1;
            for (; right >= 0; right--) {
                if (saveNumber < array[right]) {
                    array[right + 1] = array[right];
                } else {
                    break;
                }
            }
            array[right + 1] = saveNumber;
        }
        for (int value : array) {
            resultArray.append(value).append(" ");
        }
        return resultArray.toString();
    }
}
//TODO можно ли заменить ArrayEmpty?


