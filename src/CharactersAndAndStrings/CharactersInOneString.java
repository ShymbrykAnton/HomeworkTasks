package CharactersAndAndStrings;

public class CharactersInOneString {
    private int count;
    String resultStr = "";

    public String getEnglishAlphabetFromAToZ() {
        for (count = 0; count < 26; count++) {
            if (count < 25) {
                resultStr += (char) ('A' + count) + " ";
            } else {
                resultStr += (char) ('A' + count);
            }
        }
        return resultStr;
    }

    public String getEnglishAlphabetFromZToA() {
        for (count = 0; count < 26; count++) {
            if (count < 25) {
                resultStr += (char) ('z' - count) + " ";
            } else {
                resultStr += (char) ('z' - count);
            }
        }
        return resultStr;
    }

    public String getRussianAlphabetFromAtoYa() {
        for (count = 0; count < 32; count++) {
            if (count < 31) {
                resultStr += (char) ('а' + count) + " ";
            } else {
                resultStr += (char) ('а' + count);
            }
        }
        return resultStr;
    }

    public String getNumbersFrom0to9() {
        for (count = 0; count < 10; count++) {
            if (count < 9) {
                resultStr += (char) ('0' + count) + " ";
            } else {
                resultStr += (char) ('0' + count);
            }
        }
        return resultStr;
    }

    public String getASCIIPrintDiapason() {
        for (count = 0; count < 94; count++) {
            if (count < 93) {
                resultStr +=  (char) ('!' + count) + " ";
            } else {
                resultStr += (char) ('!' + count);
            }
        }
        return resultStr;
    }
}
