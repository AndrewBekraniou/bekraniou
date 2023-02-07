package by.itacademy.courses.hw2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
      int x=1;
      int y=1;

      int a = ((x + y) + (x * y));
      int b = mymetod (a);
        System.out.println(a);
    }
    public static int mymetod(int a) {
        a = new Integer(a);
            return a;
          }
}