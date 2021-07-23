package by.epam.string.stringbuilder;

import java.util.Scanner;

public class StringBuilder_3 {

    //Проверить, является ли заданное слово палиндромом

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово для проверки, является ли оно палиндромом ");
        String wordP = scan.nextLine();
        if (wordP.length() % 2 == 0) {
            ifEven(wordP);
        } else ifOdd(wordP);
    }

    private static void ifOdd(String wordP) {
        String word;
        String word2;
        word = wordP.substring(0, wordP.length() / 2 + 1);
        word2 = wordP.substring(3, wordP.length());
        StringBuffer reverse = new StringBuffer(word2);
        if (word.equals(reverse.reverse().toString())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это НЕ палиндром");
        }
    }

    private static void ifEven(String wordP) {
        String word;
        String word2;
        word = wordP.substring(0, wordP.length() / 2);
        word2 = wordP.substring(wordP.length() / 2, wordP.length());
        StringBuffer reverse = new StringBuffer(word2);
        if (word.equals(reverse.reverse().toString())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это НЕ палиндром");
        }
    }
}

