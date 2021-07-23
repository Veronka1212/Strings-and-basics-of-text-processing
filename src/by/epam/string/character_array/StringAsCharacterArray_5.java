package by.epam.string.character_array;

import java.util.Arrays;

public class StringAsCharacterArray_5 {

    // Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    //Крайние пробелы в строке удалить.

    public static void main(String[] args) {
        String songBeatles = "   Say the      word and you'll be free. Say the         word and be like me. Say the word    I'm thinking of. " +
                "Have you heard the word is       love? It's     so fine, it's sunshine, It's the word, love, In the beginning " +
                "I      misunderstood,     But now I've got it The      word is good!   ";
        songBeatles = songBeatles.trim();
        String newSongBeatles = "";
        String[] experiment = songBeatles.split("\\s");
        System.out.println(Arrays.toString(experiment));
        for (String a : experiment) {
            if (a.equals("") == false) {
                newSongBeatles = newSongBeatles.concat(a).concat(" ");
            }
        }
        System.out.println(newSongBeatles);
    }
}
