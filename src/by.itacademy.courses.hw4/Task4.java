package by.itacademy.courses.hw4;

public class Task4 {
    public static void main(String[] args) {
        double[] mas = new double[]{2.5, 5, -4.7, 0.9, 8, 145, 7, 3, 1.8, 2};
        double max = mas[0];
        double min = mas[0];
        for (int i = 0; i < mas.length; ++i)
            if (mas[i] > max)
                max = mas[i];
            else if (mas[i] < min)
                min = mas[i];
        {
            System.out.print("max = " + max + "\n" + "min = " + min);
        }
    }
}
