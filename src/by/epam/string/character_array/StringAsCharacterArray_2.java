package by.epam.string.character_array;

public class StringAsCharacterArray_2 {

    //Замените в строке все вхождения 'word' на 'letter'.

    public static void main(String[] args) {
        String songBeatles = "Say the word and you'll be free. Say the word and be like me. Say the word I'm thinking of. " +
                "Have you heard the word is love? It's so fine, it's sunshine, It's the word, love, In the beginning " +
                "I misunderstood, But now I've got it The word is good!";
        String[] array = songBeatles.split("\\s");
        String newSongBeatles = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("word")) {
                newSongBeatles = newSongBeatles.concat(replace(array[i])).concat(" ");
            } else newSongBeatles = newSongBeatles.concat(array[i]).concat(" ");
        }

        System.out.println(newSongBeatles);
    }

    public static String replace(String symbol) {
        String newString = "";
        newString = symbol.replace("word", "letter");
        return newString;
    }
}
