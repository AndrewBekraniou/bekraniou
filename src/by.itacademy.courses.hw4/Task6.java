package by.itacademy.courses.hw4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        double[] mas = {2.5, 0.5, -4.7, 0.9, 8, 145, 7, 3, 1.8, -2};
        int pol = 0;
        int neg = 0;
        for (double i : mas) {
            if (i > 0) {
                pol++;
            } else {
                neg++;
            }
        }
        double[] p = new double[pol];
        double[] n = new double[neg];
        int pl = 0;
        int ng = 0;
        for (double i : mas) {
            if (i > 0) {
                p[pl] = i;
                pl++;
            } else {
                n[ng] = i;
                ng++;
            }
        }
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(n));
    }
}

