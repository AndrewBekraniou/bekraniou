package by.itacademy.courses.hw4;

public class Task5 {
    public static void main(String[] args) {
        double[] mas = new double[]{2.5, 0.5, -4.7, 0.9, 8, 145, 7, 3, 1.8, 2};

        double minnechet = mas[0];
        for (int i = 0; i < mas.length; ++i)
            if (i%2!= 0 && mas[i] < minnechet)
                minnechet = mas[i]; {
            System.out.print("минимум из нечетных индексов массива = " + minnechet);
        }
    }
}

