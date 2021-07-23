package by.epam.strings.pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher_2 {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                " <note id = \"1\">\n" +
                " <to>Вася</to>\n" +
                " <from>Света</from>\n" +
                " <heading>Напоминание</heading>\n" +
                " <body>Позвони мне завтра!</body>\n" +
                " </note>\n" +
                " <note id = \"2\">\n" +
                " <to>Петя</to>\n" +
                " <from>Маша</from>\n" +
                " <heading>Важное напоминание</heading>\n" +
                " <body/>\n" +
                " </note>\n" +
                "</notes>";
        String[] lines = xml.split("\n");
        int i = 0;
        Pattern open = Pattern.compile("<[a-z]+>");
        Pattern close = Pattern.compile("</\\w.+?>");
        Pattern content = Pattern.compile(">(.+?)<");
        Pattern empty = Pattern.compile("<\\w.+?/>");
        for (String line : lines) {
            Matcher mOpen = open.matcher(line);
            Matcher mClose = close.matcher(line);
            Matcher mContent = content.matcher(line);
            Matcher mEmpty = empty.matcher(line);
            if (mOpen.find()) {
                System.out.println("Тег " + mOpen.group() + "--------- открытый тег");
            }
            if (mClose.find()) {
                System.out.println("Тег " + mClose.group() + "--------- закрытый тег");
            }
            if (mContent.find()) {
                System.out.println(mContent.group(1) + "---------содержимое тега");
            }
            if (mEmpty.find()) {
                System.out.println("Тег " + mEmpty.group() + "--------- тег без тела");
            }
        }
    }
}

