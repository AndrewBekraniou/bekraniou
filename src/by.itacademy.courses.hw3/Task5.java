package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 0 до 59: ");
        int x = in.nextInt();
        if (x >= 0 && x <= 14) {
            System.out.println("первая четверть");
        } else if (x >= 15 && x <= 30) {
            System.out.println("вторая четверть");
        } else if (x >= 31 && x <= 45) {
            System.out.println("третья четверть");
        } else if (x >= 46 && x <= 59) {
            System.out.println("четвертая четверть");
        } else if (x >= 60) {
            System.out.println("Ошибка! необходимо ввести число от 0 до 59");
        }
    }
}

