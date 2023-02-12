package by.itacademy.courses.hw4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        double[] mas = new double[]{2.5, 0.5, -4.7, 0.9, 8, 145, 7, 3, 1.8, -2};

        double[] p = new double[mas.length];
        double[] n = new double[mas.length];

        for (int i = 0; i < mas.length; i++) {

            if (mas[i] > 0)
                p[i]= mas [i];
            if (mas[i] < 0)
               n [i]= mas[i];
                                   }
        System.out.println(Arrays.toString(p));
             System.out.println(Arrays.toString(n));
    }
}
