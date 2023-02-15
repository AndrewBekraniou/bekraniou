package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int x = 1; x < 11; x++) {
                System.out.print(x + "*" + i + "=" + (x * i) + "     ");
            }
        }

    }
}