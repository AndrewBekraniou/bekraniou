package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите числа: \na=  ");
        int a = in.nextInt();
        System.out.print("b=  ");
        int b = in.nextInt();
        System.out.print("c=  ");
        int c = in.nextInt();

        if ((a < b) && (b < c)) {
            System.out.println("Вывод чисел по возрастанию: " + a + " " + b + " " + c);
        } else if ((b < a) && (a < c)) {
            System.out.println("Вывод чисел по возрастанию: " + b + " " + a + " " + c);
        } else if ((c < a) && (a < b)) {
            System.out.println("Вывод чисел по возрастанию: " + c + " " + a + " " + b);
        } else if ((a < c) && (c < b)) {
            System.out.println("Вывод чисел по возрастанию: " + a + " " + c + " " + b);
        } else if ((b < c) && (c < a)) {
            System.out.println("Вывод чисел по возрастанию: " + b + " " + c + " " + a);
        } else if ((c < b) && (b < a)) {
            System.out.println("Вывод чисел по возрастанию: " + c + " " + b + " " + a);
        }
    }
}
