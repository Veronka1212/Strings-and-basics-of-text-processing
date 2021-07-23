package by.epam.string.pattern_matcher;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;


public class PatternAndMatcher_1 {

    // Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
    //операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
    //отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
    //алфавиту.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Долго боролась зима с ненастной осенью. В ноябре снег одел пушистым нарядом лес, и наступила зима.\n"+
                "Гуляет в поле вьюга. В лесу все тонет под белым покровом. Красота! Зайдешь в лесную глушь и не узнаешь знакомых мест. Густо покрывают ветви елей пушистые и пышные хлопья снега.\n" +
                "Прячутся в норку ежи, укрываются от мороза белки в зимние гнезда. Плохо птицам зимой. Они часто погибают от холода и голода. Как им помочь?\n" +
                "Запасите с осени корм для птиц. Сделайте для них кормушки. Птицы – наши друзья. Помогайте им!";
        System.out.print(str);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Введите номер необходимой операции:\n 1 -отсортировать абзацы по количеству предложений \n 2 -в каждом предложении отсортировать слова по длине \n 3 -отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по \n" +
                "алфавиту");

        int n = extracted(scan);
        String[] str2 = str.toString().split("[\\.\\?\\!]\\s");

        switch (n) {
            case 1: {
                sortingSentence(str);
                break;
            }
            case 2: {
                for (int i = 0; i < str2.length; i++) {
                    wordsSentens(str2[i]);
                }
                break;
            }
            case 3: {
                System.out.println("Введите заданный символ ");
                String symbol = scan.next();
                int i = 0;
                for (i = 0; i < str2.length; i++) {
                    alphabet(orderOfWordsInAsentence(str2[i], symbol), symbol);
                }
                break;
            }
        }
    }

    private static int extracted(Scanner scan) {
        int n;
        while (true) {
            try {
                n = parseInt(scan.next());
                if (n >= 1 & n <= 3) {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, прочитайте условия");
                continue;
            }
            System.out.println("Вы ввели неверный номер операции, прочтите условия и попробуйте ещё раз");
        }
    }

    public static void sortingSentence(String str) {// 1
        String[] array = str.toString().split("\n");
        String s = "";
        String buffer = "";
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (numOfSentences(array[i]) < numOfSentences(array[i + 1])) {
                    buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("    " + array[i]);
        }
    }

    public static void wordsSentens(String word) { //предложение по количеству символов в словах
        String[] array = word.toString().split("\\,?\\:?\\;?\\s?\\-?\\s");
        String buffer = "";
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].length() < array[i + 1].length()) {
                    buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(array) + ". ");
    }

    public static int numOfCharacters(String word, String symbol) { //количество симолов в лексеме
        int x = 0;
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equals(symbol)) {
                x++;
            }
        }
        return x;
    }

    public static int numOfSentences(String word) { //1
        int x = 0;
        int i = 0;
        Pattern p1 = Pattern.compile("\\.?\\??\\!?");
        for (i = 0; i < word.length(); i++) {
            Matcher m1 = p1.matcher(String.valueOf(word.charAt(i)));
            if (m1.matches()) {
                x++;
            }
        }
        return x;
    }

    public static String[] orderOfWordsInAsentence(String word, String s) {//лексемы по заданному символу по позрастанию
        String[] arrayOfWords = word.toString().split("\\,?\\:?\\;?\\s?\\-?\\s");
        String buffer = "";
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arrayOfWords.length - 1; i++) {
                if (numOfCharacters(arrayOfWords[i], s) < numOfCharacters(arrayOfWords[i + 1], s)) {
                    buffer = arrayOfWords[i + 1];
                    arrayOfWords[i + 1] = arrayOfWords[i];
                    arrayOfWords[i] = buffer;
                    flag = true;
                }
            }
        }
        return arrayOfWords;
    }

    public static void alphabet(String[] arrayOfWords, String s) {//лексемы по алфавиту
        String buffer = "";
        boolean flag = true;
        Object a = 0;
        Object b = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < arrayOfWords.length - 1; i++) {
                a = numOfCharacters(arrayOfWords[i], s);
                b = numOfCharacters(arrayOfWords[i + 1], s);
                if (a.equals(b) & arrayOfWords[i].toLowerCase().codePointAt(0) > arrayOfWords[i + 1].toLowerCase().codePointAt(0)) {
                    buffer = arrayOfWords[i + 1];
                    arrayOfWords[i + 1] = arrayOfWords[i];
                    arrayOfWords[i] = buffer;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(arrayOfWords) + ". ");
    }
}
