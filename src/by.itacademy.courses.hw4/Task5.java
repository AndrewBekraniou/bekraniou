package by.itacademy.courses.hw4;

public class Task5 {
    public static void main(String[] args) {
        double[] mas = new double[]{2.5, 0.5, -4.7, 0.9, 8, 145, 7, 3, 1.8, 2};

        double min_ne_chet = mas[0];
        for (int i = 0; i < mas.length; ++i)
            if (i % 2 != 0 && mas[i] < min_ne_chet)
                min_ne_chet = mas[i];
        {
            System.out.print("минимум из нечетных индексов массива = " + min_ne_chet);
        }
    }
}

