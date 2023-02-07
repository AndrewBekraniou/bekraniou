package by.itacademy.courses.hw3;
import java.util.Scanner;
public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону a: ");
        System.out.println("Введите сторону b: ");
        System.out.println("Введите сторону c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Треугольник существует");}
        else {
            System.out.println("Треугольник не существует");
        }
    }
}

