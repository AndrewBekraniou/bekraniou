package by.itacademy.courses.hw4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        double[] mas = {2.5, 0.5, -4.7, 0.9, 8, 145, 7, 3, 1.8, -2};
        int pologit = 0;
        int negativ = 0;
        for (double element : mas) {
            if (element > 0) {
                pologit++;
            } else {
                negativ ++;
            }
        }
        double[] p = new double[pologit];
        double[] n = new double[negativ];
        int plelem = 0;
        int negelem = 0;
        for (double element : mas) {
            if (element > 0) {
                p[plelem] = element;
                plelem++;
            } else {
                n[negelem] = element;
                negelem++;
            }
        }
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(n));
    }
}

