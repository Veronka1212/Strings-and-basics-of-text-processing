package by.epam.strings.stringbuilder;

import java.util.Scanner;

public class StringBuilder_6 {

    //Из заданной строки получить новую, повторив каждый символ дважды.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scan.nextLine();
        System.out.println("Новая строка: " + lineNew(line));
    }

    public static String lineNew(String line) {
        String newLine = "";
        String[] line2 = line.split("");
        for (int i = 0; i < line.length(); i++) {
            newLine = newLine.concat(line2[i]).concat(line2[i]);
        }
        return newLine;
    }
}
