package by.itacademy.courses.hw3;

import java.util.Scanner;

    public class Task2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("введите число: ");
            int a = in.nextInt();

            if (a < 0 && a % 2 == 0) {
                System.out.println("четное отрицательное");
            } else if (a > 0 && a % 2 != 0) {
                System.out.println("нечетное положительное");
            } else {
                System.out.println("число ни нечетное положительное ни четное отрицательное");
            }
        }
    }

