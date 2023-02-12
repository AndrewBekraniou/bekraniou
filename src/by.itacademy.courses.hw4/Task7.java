package by.itacademy.courses.hw4;
import java.util.Random;
public class Task7 {

    public static void main(String[] args)
    {
        int n=4;
        int[] mas = new int[n];
        Random rand = new Random();
        {
        System.out.println("Начальный массив ");
        }
        for (int i = 0; i < mas.length; i ++)
        {
            mas[i] = rand.nextInt(20);
            System.out.print(" " + mas[i]);
        }
        for (int i=0;i<n/2;i++)
        {
            int j=mas[i];
            mas[i]=mas[n-1-i];
            mas[n-1-i]=j;
        }
           System.out.println("\n"+"Перевернутый массив ");
        for (int i = 0; i < mas.length; i++)
        {
            System.out.print(" " + mas[i]);
        }
    }
}


