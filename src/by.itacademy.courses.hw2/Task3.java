package by.itacademy.courses.hw2;

public class Task3 {
        public static void main(String[] args) {
        int sek=12345678;
        int n=sek/60/60/24/7;
        int d=sek/60/60/24%7;
        int h=sek/60/60%24;
        int m=sek/60%60;
        int s=sek%60;
        System.out.printf("%d недель %d дней %d часов %d минут %d секунд", n, d , h, m, s);
        }

            }