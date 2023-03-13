package by.itacademy.courses.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task7 {
    public static void main(String[] args) {
        System.out.println(email("andrew@gmail.com"));
        System.out.println(email("a.ivanov@gmail.com.by"));
        System.out.println(email("supermen1980@yandex.ru"));
    }
        public static boolean email(String testString) {
            Pattern pattern = Pattern.compile("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,4})$");
            Matcher matcher = pattern.matcher(testString);
            return matcher.matches();
    }
}