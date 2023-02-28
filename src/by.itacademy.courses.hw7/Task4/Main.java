package by.itacademy.courses.hw7.Task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(new Rose(), new Rose(), new Rose(), new Chamomile(), new Chamomile(), new Chamomile(),new Carnation());
        System.out.println("Стоимость букета: "+bouquet.price());
        System.out.println("Цвета цветов в букете: "+bouquet.color());
        System.out.println("Срок годности цветов в букете: "+bouquet.expirationdate());
    }
}
