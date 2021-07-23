package by.epam.strings.character_array;

public class StringAsCharacterArray_3 {

    //В строке найти количество цифр

    public static void main(String[] args) {
        String text = "Bobruysk occupies an area of 66 square kilometres (25 sq mi),and comprises over 450 streets whose " +
                "combined length stretches for over 430 km (267 mi).";
        char[] sArray = text.toCharArray();
        int x = 0;
        for (Character n : sArray) {
            if (numerals(n.toString())) {
                x++;
            }
        }
        System.out.println("Кол-во цифр в тексте: "+x);
    }
    public static boolean numerals(String s) {
        boolean flag = false;
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (String n : num) {
            if (s.equals(n)) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }
}
