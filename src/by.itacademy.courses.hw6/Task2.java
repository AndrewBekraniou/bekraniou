package by.itacademy.courses.hw6;

public class Task2 {
    public static void main(String[] args) {

        String text = "111 222 33333333333";
        String[] numbers = text.split(" ");
        int maxIndex = 0, maxLen = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() > maxLen) {
                maxIndex = i;
                maxLen = numbers[i].length();
            }
        }
        System.out.println("Наибольшее количество подряд идущих цифр- "+numbers[maxIndex]);
    }
}




