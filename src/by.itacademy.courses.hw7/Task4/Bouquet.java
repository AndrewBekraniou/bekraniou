package by.itacademy.courses.hw7.Task4;

import java.util.Arrays;

public class Bouquet {
    public static Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public static double price() {
        double price = 0;
        for (Flower flower : flowers) {
            price += flower.price;
        }
        return price;
    }
    public String color() {
        StringBuilder color = new StringBuilder();
        for (Flower flower : flowers) {
            color.append(flower.color);
        }
        return color.toString();
    }
    public String expirationdate() {
        StringBuilder expirationdate = new StringBuilder();
        for (Flower flower : flowers) {
            expirationdate.append(flower.expirationdate);
            }
        return expirationdate.toString();
    }
}











