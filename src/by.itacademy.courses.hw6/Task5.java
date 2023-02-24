package by.itacademy.courses.hw6;

import java.util.regex.Pattern;

public class Task5 {

    public static void main(String args[]) {
        String text = ("Object-oriented programming is a programming language model "
                + "organized around objects rather than \"actions\" and data rather than logic. "
                + "Object-oriented programming blabla. Object-oriented programming bla.");
        Pattern pattern = Pattern.compile("object-oriented programming", Pattern.CASE_INSENSITIVE);

        replacemetod(text, "Object-oriented programming", "OOP");
        System.out.println(replacemetod(text, "Object-oriented programming", "OOP"));
    }
    public static String replacemetod(String text, String word, String replacement) {
    return text.replaceAll("(" + "Object-oriented programming" + ".*?)" + "Object-oriented programming", "$1" + "OOP");
    }
}

