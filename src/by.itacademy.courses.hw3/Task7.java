package by.itacademy.courses.hw3;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     System.out.println("Введите число a: ");
     System.out.println("Введите число b: ");
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println("Каков результат умножения первого числа на второе?");
    int c = in.nextInt();
if (c==a*b) {
        System.out.printf("Верно");}
else {
        System.out.println("Не Верно");
        System.out.printf("Верный ответ = %d",(a*b));
    }
}
}

