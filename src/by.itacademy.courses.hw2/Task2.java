package by.itacademy.courses.hw2;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int b = mymetod(num1, num2);
        System.out.println(b);
    }
    public static int mymetod(int x, int y) {
        return ((x + y) + (x * y));
    }
}