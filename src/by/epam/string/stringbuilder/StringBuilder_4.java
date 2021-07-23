package by.epam.string.stringbuilder;

import java.util.Arrays;

public class StringBuilder_4 {

    //С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    public static void main(String[] args) {
        String word="информатика";
        String[] array=word.split("");
        System.out.println(Arrays.toString(array));
        String tort="";
        tort=tort.concat(array[7]).concat(array[3]).concat(array[4]).concat(array[7]);
        System.out.println(tort);
    }
}
