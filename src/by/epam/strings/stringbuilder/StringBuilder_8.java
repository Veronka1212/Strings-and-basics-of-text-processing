package by.epam.strings.stringbuilder;

import java.util.Scanner;

public class StringBuilder_8 {

    //Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    // Случай, когда самых длинных слов может быть несколько, не обрабатывать.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку с пробелами для проверки: ");
        String line = scan.nextLine();
        System.out.println("Самое длинное слово в строке - "+longWord(line));
    }
    public static String longWord (String line){
        String[] array=line.split(" ");
        int maxElementLength=0;
        String maxElement="";
        for(int i=0;i<array.length;i++){
            if (array[i].length()>maxElementLength) {
                maxElementLength=array[i].length();
                maxElement=array[i];
            }
        }
        return maxElement;
    }
}
