package by.itacademy.courses.hw6;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String text = "Длинное слово кор";
        String[] arr = text.split(" ");
        int max = 0;
        int min = arr[0].length();
        int maxi = 0;
        int mini = 0;
        System.out.println("Исходный текст: " +Arrays.toString(arr));

        for (String val : arr) {
            if (val.length() > max) max = val.length();
            else if (val.length() < min) min = val.length();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == max) {
                maxi = i;
                String maxznachenie = arr[i];
                System.out.println("самое длинное слово- " + maxznachenie + "; номер элемента- " + maxi);
            } else if (arr[i].length() == min) {
                mini = i;
                String minznachenie = arr[i];
                System.out.println("самое короткое слово- " + minznachenie + "; номер элемента- " + mini);
            }
        }
        String temp = arr[mini];
        arr[mini] = arr[maxi];
        arr[maxi] = temp;
        System.out.println("Получаемый текст: "+Arrays.toString(arr));
    }
}







