package by.itacademy.courses.hw3;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите числа a=  ");
        System.out.print("b=  ");
        System.out.print("c=  ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ((a < b) && (a < b)){
            System.out.println(a + " " + b + " " + c);}
       else if ((b < a) && (a < c)){
            System.out.println(b + " " + a + " " + c);}
       else if ((c < a) && (a < b)){
            System.out.println(c + " " + a + " " + b);}
       else if ((a < c) && (c < b)){
            System.out.println(a + " " + c + " " + b);}
       else if ((b < c) && (c < a)){
            System.out.println(b + " " + c + " " + a);}
       else if ((c < b) && (b < a)) {
            System.out.println(c + " " + b + " " + a);
        }
    }
}
