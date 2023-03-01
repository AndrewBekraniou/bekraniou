package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = in.nextInt();

        int summa = 0;
        int proiz = 1;

        while (i > 0) {
            int ost = i % 10;
            summa = summa + ost;
            proiz = proiz * ost;
            i /= 10;
        }
        System.out.println("сумма чисел  " + summa);
        System.out.println("произведение чисел  " + proiz);
    }
}
