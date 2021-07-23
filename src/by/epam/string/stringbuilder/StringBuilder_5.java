package by.epam.string.stringbuilder;

import java.util.Scanner;

public class StringBuilder_5 {

    // Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для проверки");
        String line = scan.nextLine();
        String[] array = line.split("");
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("a")) {
                flag++;
            }
        }
        System.out.println("Буква А встречается в данной строке " + flag + " раз(а)");
    }
}
