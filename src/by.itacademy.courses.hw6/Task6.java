package by.itacademy.courses.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] arg) {
        String text = "Versions: Java  5, Java 6, Java 7, Java 8, Java 12.";
        String patterString = "Java\\s+\\d{1,2}";
        Pattern p = Pattern.compile(patterString);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
