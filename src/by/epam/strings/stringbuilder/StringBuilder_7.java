package by.epam.strings.stringbuilder;

import java.util.Scanner;

public class StringBuilder_7 {

    //Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    // Например, если было введено "abc cdedef", то должно быть выведено "abcdef".

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        String line = scan.nextLine();
        String element;
        line = line.replaceAll(" ", "");
        StringBuilder newLine = new StringBuilder(line);
        for (int i = 0; i < newLine.length(); i++) {
            element = String.valueOf(newLine.charAt(i));
            newLine = deleteElements(newLine, element);
        }
        System.out.println("Новая строка: " + newLine.toString().replaceAll(" ", ""));
    }


    public static StringBuilder deleteElements (StringBuilder line, String symbol) {
        String element;
        int flag = 0;
        for (int i = 0; i < line.length(); i++) {
            element = String.valueOf(line.charAt(i));
            if (element.equals(symbol)) {
                flag++;
            }
            if (element.equals(symbol) & flag > 1) {
                line.replace(i, i + 1, " ");
            }
        }
        return line;
    }
}
