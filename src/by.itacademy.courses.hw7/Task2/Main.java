package by.itacademy.courses.hw7.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("введите температуру по Цельсию: ");
        double znachcelsiy = in.nextInt();

        System.out.println("Температура по Цельсию = " + znachcelsiy + " C");
        System.out.println("Температура по Кельвину = " + new Kelvin().convet(znachcelsiy) + " K");
        System.out.println("Температура по Фаренгейту = " + new Farengeyt().convet(znachcelsiy) + " F");
    }
}
