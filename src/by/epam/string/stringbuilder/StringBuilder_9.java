package by.epam.string.stringbuilder;

import java.util.Scanner;

public class StringBuilder_9 {

    //Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
    //буквы.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        String line = scan.nextLine();
        int i = 0;
        System.out.println(line.codePointAt(0));
        int uppCase = 0;
        int lowerCase = 0;
        for (i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i)) & 90 >= line.codePointAt(i) & line.codePointAt(i) >= 65) {
                uppCase++;
            }
            if (Character.isLowerCase(line.charAt(i)) & 122 >= line.codePointAt(i) & line.codePointAt(i) >= 97) {
                lowerCase++;
            }
        }
        System.out.println("Количество строчных английских символов "+lowerCase+", количество прописных английских символов "+uppCase);
    }
}
