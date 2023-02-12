package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();

        int f = 1;
        for (int i = 1; i <= a; i++)
            f=f*i;
        {
            System.out.print(a + "!" + "=" + f);
        }
    }
}