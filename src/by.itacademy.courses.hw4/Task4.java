package by.itacademy.courses.hw4;

public class Task4 {
    public static void main(String[] args) {
        double[] mas = new double[]{1, 5, 4.7, 0.9, 8, 145, 7, 3, 1.8, 200};
        double max = mas[0];
        double min = mas[0];
        int maxi = 0;
        int mini = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                maxi = i;
            } else if (mas[i] < min) {
                min = mas[i];
                mini = i;
            }
        }
        System.out.println("max число в массиве = " + max + "; номер индекса массива = " + maxi);
        System.out.println("min число в массиве = " + min + "; номер индекса массива = " + mini);
    }
}






