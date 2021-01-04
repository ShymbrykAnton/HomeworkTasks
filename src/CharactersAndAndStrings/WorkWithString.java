package CharactersAndAndStrings;

import java.util.Locale;

public class WorkWithString {
    public int getLengthOfMinWord(String word) {
        if (word.trim().equals("")) {
            return 0;
        }
        word = word.toLowerCase(Locale.ROOT) + " ";
        word = removeExtraSpaces(word);
        int punctuationMarkIndex = 0, saveLength = 0, saveCounter = 0, resultLength = 0;
        int firstCounter = 0;
        for (int count = 0; count < word.length(); count++) {
            for (int symbolsCount = 33; symbolsCount < 65; symbolsCount++) {
                if ((word.charAt(count) == (char) (symbolsCount)) && (symbolsCount < 48 || symbolsCount > 57)) {
                    punctuationMarkIndex++;
                    break;
                }
            }
            if (word.charAt(count) == ' ') {
                if (firstCounter == 0) {
                    saveLength = count - punctuationMarkIndex - saveCounter;
                    saveCounter = count;
                    punctuationMarkIndex = 0;
                    resultLength = saveLength;
                } else {
                    saveLength = count - punctuationMarkIndex - saveCounter - 1;
                    saveCounter = count;
                    punctuationMarkIndex = 0;
                }
                firstCounter++;
            }

            if (resultLength > saveLength) {
                resultLength = saveLength;
            }
        }
        return resultLength;
    }

    public String replaceLastThreeSymbols(String[] words, int length) {
        if (words.length < 1) {
            return "";
        }
        String[] resultString = new String[words.length];
        for (int wordCounter = 0; wordCounter < words.length; wordCounter++) {
            resultString[wordCounter] = "";
            if (words[wordCounter].trim().length() == length) {
                for (int charCounter = 0; charCounter < words[wordCounter].length(); charCounter++) {
                    if (charCounter >= words[wordCounter].length() - 3) {
                        resultString[wordCounter] += '$';
                    } else {
                        resultString[wordCounter] += words[wordCounter].charAt(charCounter);
                    }
                }
            } else {
                resultString[wordCounter] = words[wordCounter];
            }
        }
        String endString = "";
        for (String word : resultString) {
            endString += word + " ";
        }
        return endString.trim();
    }

    public String addSpaceAfterPunctuationMark(String word) {
        if (word.equals("")) {
            return "";
        }
        int punctuationMarkIndex = 0;
        boolean isPunctuation = false;
        String resultStr = "";
        for (int charCounter = 0; charCounter < word.length(); charCounter++) {
            for (int symbolsCount = 33; symbolsCount < 65; symbolsCount++) {
                if ((symbolsCount < 48 || symbolsCount > 57) && (word.charAt(charCounter) == (char) (symbolsCount))) {
                    punctuationMarkIndex = charCounter;
                    isPunctuation = true;
                    break;
                }
            }
            resultStr += word.charAt(charCounter);
            if ((isPunctuation) && (punctuationMarkIndex + 1 < word.length()) && (word.charAt(punctuationMarkIndex + 1) != ' ')) {
                resultStr += " ";
                isPunctuation = false;
            }
        }
        return resultStr;
    }

    public String deleteRepeatedSymbols(String word) {
        if (word.equals("")) {
            return "";
        }
        word = word.trim();
        char[] array = new char[word.length()];
        for (int count = 0; count < array.length; count++) {
            array[count] = word.charAt(count);
        }

        for (int charInArrayCounter = 0; charInArrayCounter < array.length; charInArrayCounter++) {
            for (int charInWordCounter = 0; charInWordCounter < word.length(); charInWordCounter++) {
                if (array[charInArrayCounter] != word.charAt(charInWordCounter) && charInArrayCounter != charInWordCounter) {
                    array[charInArrayCounter] = word.charAt(charInArrayCounter);
                }
                if (array[charInArrayCounter] == word.charAt(charInWordCounter) && charInArrayCounter != charInWordCounter) {
                    array[charInWordCounter] = ' ';
                }
            }
        }
        String resultStr = "";
        for (char v : array) {
            resultStr += v;
        }
        return resultStr;
    }

    public int countNumberOfWords(String word) {
        if (word.equals("")) {
            return 0;
        }
        word = word.trim();
        word = removeExtraSpaces(word);
        int wordCounter = 1;
        for (int counter = 0; counter < word.length(); counter++) {
            if (word.charAt(counter) == ' ') {
                wordCounter++;
            }
        }
        return wordCounter;
    }

    private String removeExtraSpaces(String word) {
        String wordWithOneSpace = "";
        for (int spaceCount = 0; spaceCount < word.length(); spaceCount++) {
            if (spaceCount + 1 < word.length() && word.charAt(spaceCount + 1) == ' ' && word.charAt(spaceCount) == ' ') {
                wordWithOneSpace += "";
            } else {
                wordWithOneSpace += word.charAt(spaceCount);
            }
        }
        return wordWithOneSpace;
    }

    public String deletePartOfString(int position, int length, String words) {
        if (words.equals("")) {
            return "";
        }
        String resultStr = "";
        for (int count = 0; count < words.length(); count++) {
            if (count <= position - 1 || count >= (position + length)) {
                resultStr += words.charAt(count);
            }
        }
        return resultStr;
    }

    public String reverseStr(String words) {
        if (words.equals("")) {
            return "";
        }
        String reversedString = "";
        words = words.trim();
        int wordIndexEnd = words.length() - 1;
        for (int count = 0; count < words.length(); count++) {
            reversedString += words.charAt(wordIndexEnd);
            wordIndexEnd--;
        }
        return reversedString;
    }

    public String deleteLastWord(String words) {
        if (words.equals("")) {
            return "";
        }
        words = words.trim();
        int lastSpaceIndex = 0;
        String resultStr = "";
        for (int count = 0; count < words.length(); count++) {
            if (words.charAt(count) == ' ') {
                lastSpaceIndex = count;
            }
        }
        for (int count2 = 0; count2 < lastSpaceIndex; count2++) {
            resultStr += words.charAt(count2);
        }
        return resultStr;
    }
}
