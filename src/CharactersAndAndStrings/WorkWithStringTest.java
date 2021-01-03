package CharactersAndAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class WorkWithStringTest {
    WorkWithString workWithString = new WorkWithString();

    static Stream<Arguments> getLengthOfMinWordTest_NOMINAL() {
        return Stream.of(
                arguments("Ваших душ безлиственную   осень", 3),
                arguments("Мне нравится, когда каменья брани", 3),
                arguments("Летят в меня, как град рыгающей грозы,", 1),
                arguments("", 0),
                arguments("55555 666666 88888888 @4444, 666666", 4),
                arguments("В1 ту страну, куда мы п.", 1)
        );
    }

    static Stream<Arguments> replaceLastThreeSymbolsTest_NOMINAL() {
        String[] array = {" ", "Слово", "Ад", "Мир", "Хорошо", "Летит", "На", "Май", "Апогей"};
        String[] array1 = {};
        return Stream.of(
                arguments(array, 0, "$ Слово Ад Мир Хорошо Летит На Май Апогей"),
                arguments(array, 2, "Слово $$ Мир Хорошо Летит $$ Май Апогей"),
                arguments(array, 3, "Слово Ад $$$ Хорошо Летит На $$$ Апогей"),
                arguments(array, 5, "Сл$$$ Ад Мир Хорошо Ле$$$ На Май Апогей"),
                arguments(array, 6, "Слово Ад Мир Хор$$$ Летит На Май Апо$$$"),
                arguments(array1, 0, "")
        );
    }

    static Stream<Arguments> addSpaceAfterPunctuationMarkTest_NOMINAL() {
        String text = "Текст, в своем роде, состоит из некоторого количества предложений.";
        return Stream.of(
                arguments("", ""),
                arguments("Текст, в своем роде, состоит из некоторого количества предложений.", text),
                arguments("Текст,в своем роде,состоит из некоторого количества предложений.", text),
                arguments("Текст,в своем роде,состоит из некоторого количества предложений.", text),
                arguments("От!Цокота?Копыт.Пыль)Летит.", "От! Цокота? Копыт. Пыль) Летит."),
                arguments("Пыль,по.:полю,летит.", "Пыль, по. : полю, летит.")
        );
    }

    static Stream<Arguments> deleteRepeatedSymbolsTest_NOMINAL() {
        return Stream.of(
                arguments("", ""),
                arguments("Бык по полю ходил", "Бык    п  ю ходил"),
                arguments("И cнова поле ", "И cн ва поле"),
                arguments("aaa dffff ,,,, sssaf, вот тАк", "    d            saf, во  тАк"),
                arguments("1 22 333 4444 55555 666666 77 ", "1  2   3    4     5      6  7")
        );
    }

    static Stream<Arguments> countNumberOfWordsTest_NOMINAL() {
        return Stream.of(
                arguments("", 0),
                arguments("Ваших душ безлиственную осень", 4),
                arguments("Летят в меня, как град рыгающей грозы,", 7),
                arguments("55555 666666  88888888 @4444, 666666", 5),
                arguments("В1 ту страну,   куда мы п.", 6),
                arguments("И cнова поле ", 3)
        );
    }

    static Stream<Arguments> deletePartOfStringTest_NOMINAL() {
        return Stream.of(
                arguments(1, 10, "", ""),
                arguments(1, 9, " 123456789 12345689 12345689", "  12345689 12345689"),
                arguments(11, 9, " 123456789 12345689 12345689", " 123456789  12345689"),
                arguments(3, 2, " 123456789 12345689 12345689", " 1256789 12345689 12345689"),
                arguments(12, 3, " 123456789 12345689 12345689", " 123456789 15689 12345689"),
                arguments(22, 4, " 123456789 12345689 12345689", " 123456789 12345689 1689")
        );
    }

    static Stream<Arguments> reverseStrTest_NOMINAL() {
        return Stream.of(
                arguments("", ""),
                arguments("Ваших душ безлиственную осень", "ьнесо юунневтсилзеб шуд хишаВ"),
                arguments("Летят в меня, как град рыгающей грозы,", ",ызорг йещюагыр дарг как ,янем в тятеЛ"),
                arguments("aaa dffff ,,,, sssaf, вот тАк", "кАт тов ,fasss ,,,, ffffd aaa"),
                arguments(" 123456789  12345689 12345689", "98654321 98654321  987654321"),
                arguments("От!Цокота?Копыт.Пыль)Летит.", ".титеЛ)ьлыП.тыпоК?атокоЦ!тО")
        );
    }

    static Stream<Arguments> deleteLastWordTest_NOMINAL() {
        return Stream.of(
                arguments("", ""),
                arguments("Ваших душ безлиственную осень", "Ваших душ безлиственную"),
                arguments("Летят в меня, как град рыгающей грозы,", "Летят в меня, как град рыгающей"),
                arguments("aaa dffff ,,,, sssaf, вот тАк", "aaa dffff ,,,, sssaf, вот"),
                arguments(" 123456789  12345689 12345689", "123456789  12345689"),
                arguments("От!Цокота?Копыт.Пыль)Летит.", "")
        );
    }

    @ParameterizedTest
    @MethodSource("getLengthOfMinWordTest_NOMINAL")
    void getLengthOfMinWordTest(String word, int expected) {
        int actual = workWithString.getLengthOfMinWord(word);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("replaceLastThreeSymbolsTest_NOMINAL")
    void replaceLastThreeSymbolsTest(String[] words, int length, String expected) {
        String actual = workWithString.replaceLastThreeSymbols(words, length);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("addSpaceAfterPunctuationMarkTest_NOMINAL")
    void addSpaceAfterPunctuationMarkTest(String word, String expected) {
        String actual = workWithString.addSpaceAfterPunctuationMark(word);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("deleteRepeatedSymbolsTest_NOMINAL")
    void deleteRepeatedSymbolsTest(String word, String expected) {
        String actual = workWithString.deleteRepeatedSymbols(word);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("countNumberOfWordsTest_NOMINAL")
    void countNumberOfWordsTest(String word, int expected) {
        int actual = workWithString.countNumberOfWords(word);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("deletePartOfStringTest_NOMINAL")
    void deletePartOfStringTest(int position, int length, String word, String expected) {
        String actual = workWithString.deletePartOfString(position, length, word);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("reverseStrTest_NOMINAL")
    void reverseStrTest(String word, String expected) {
        String actual = workWithString.reverseStr(word);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("deleteLastWordTest_NOMINAL")
    void deleteLastWordTest(String word, String expected) {
        String actual = workWithString.deleteLastWord(word);
        Assertions.assertEquals(expected, actual);
    }
}