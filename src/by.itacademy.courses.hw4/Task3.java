package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int entnum = in.nextInt();

        int fact = 1;
        for (int i = 1; i <= entnum; i++)
            fact = fact * i;
        System.out.print(entnum + "!" + "=" + fact);
    }
}