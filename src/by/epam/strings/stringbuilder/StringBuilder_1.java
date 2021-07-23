package by.epam.strings.stringbuilder;

public class StringBuilder_1 {

    //Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

    public static void main(String[] args) {
        String text = "Bobruysk    occupies an area of 66 square kilometres (25 sq mi), and  comprises      over 450 streets whose " +
                "combined length   stretches for over 430 km (267 mi).";
        System.out.println("Наибольшее количество подряд идущих пробелов " + space(text));
    }

    public static int space(String text) {
        boolean flag2 = false;
        int x = 0;
        int i = 0;
        int num = 0;
        int numbuffer = 0;
        char buffer;
        for (i = 0; i < text.length(); i++) {
            buffer = text.charAt(i);
            if (String.valueOf(buffer).equals(" ") == false) {
                flag2 = false;
            }
            if (numbuffer > num & flag2 == false) {
                num = numbuffer;
                numbuffer = 0;
            }
            if (numbuffer <= num & flag2 == false) {
                numbuffer = 0;
            }
            if (String.valueOf(buffer).equals(" ")) {
                numbuffer++;
                flag2 = true;
            }
        }
        return num;
    }
}
