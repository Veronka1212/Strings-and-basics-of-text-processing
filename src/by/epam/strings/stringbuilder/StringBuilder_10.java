package by.epam.strings.stringbuilder;

public class StringBuilder_10 {

    //. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
    //знаком. Определить количество предложений в строке X.

    public static void main(String[] args) {
        String str = "Вокзал-это большой вход в город. Собрался человек уехать из города. На вокзале ему всё расскажут. " +
                "Там в справочном бюро дают справки. Когда поезд? Какой это поезд – местный или дальнего следования? " +
                "Где купить билет? Куда сдать багаж? Где находится багажный вагон? Где можно укрыться от яростного ветра" +
                " и ненастной погоды? Здесь объявляют приезд и отъезд поездов. Здесь много радостных встреч!";
        System.out.println("Количество предложений в строке " + getInt(str));
    }

    public static int getInt(String str) {
        int i = 0;
        int flag = 0;
        for (i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(".") | String.valueOf(str.charAt(i)).equals("!") | String.valueOf(str.charAt(i)).equals("?")) {
                flag++;
            }
        }
        return flag;
    }
}
