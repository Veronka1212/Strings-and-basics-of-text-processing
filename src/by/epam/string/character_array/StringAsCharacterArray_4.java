package by.epam.string.character_array;

public class StringAsCharacterArray_4 {

    //В строке найти количество чисел

    public static void main(String[] args) {
        String text = "Bobruysk occupies an area of 66 square kilometres (25 sq mi),and comprises over 450 streets whose " +
                "combined length stretches for over 430 km (267 mi).";
        char[] sArray = text.toCharArray();
        System.out.println("Кол-во чисел в тексте: " + number(sArray));
    }

    public static boolean digit(char a) {
        boolean flag = false;
        String num = "1234567890";
        if (num.contains(String.valueOf(a))) {
            flag = true;
        }
        return flag;
    }

    public static int number(char[] array) {
        boolean flag2 = false;
        int x = 0;
        int i = 0;
        int num = 0;
        while (i < array.length) {
            if (x >= 2 & !flag2) {
                num++;
                x = 0;
            }
            if (digit(array[i])) {
                x++;
                flag2 = true;
            } else flag2 = false;
            i++;
        }
        return num;
    }
}