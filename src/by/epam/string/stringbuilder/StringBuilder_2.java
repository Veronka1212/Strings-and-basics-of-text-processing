package by.epam.string.stringbuilder;

public class StringBuilder_2 {

    // В строке вставить после каждого символа 'a' символ 'b'

    public static void main(String[] args) {
        String text = "Bobruysk occupies an area of 66 square kilometres (25 sq mi),and comprises over 450 streets whose " +
                "combined length stretches for over 430 km (267 mi).";
        StringBuilder textNew= new StringBuilder(text);
        System.out.println(past(textNew));

    }
    public static StringBuilder past (StringBuilder text){
        for (int i=0;i<text.length();i++){
            String a=String.valueOf(text.charAt(i));
            if (a.equals("a")) {
                text.insert(i+1,"b");
            }
        }
        return text;
    }

}
