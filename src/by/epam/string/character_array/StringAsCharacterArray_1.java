package by.epam.string.character_array;

public class StringAsCharacterArray_1 {

    //Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

    public static void main(String[] args) {
        String[] array = {"newVar", "aInt", "numberOf", "selectOfNum", "blackCarToy2", "blackAndWhite", "crazyMouth", "beginAndStopGame"};
        for (String a : array) {
            System.out.print(snake_case(a) + ", ");
        }
    }

    public static String snake_case(String symbol) {
        String newSymbol = "";
        char[] s = symbol.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (Character.isLowerCase(s[i])) {
                newSymbol = newSymbol.concat(String.valueOf(s[i]));
            } else {
                newSymbol = newSymbol.concat("_").concat(String.valueOf(s[i]).toLowerCase());
            }
        }
        return newSymbol;
    }
}