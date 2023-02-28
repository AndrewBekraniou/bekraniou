package by.itacademy.courses.hw7.Task3;

public abstract class Fruits {
    double weight;
    public Fruits(double weight) {
        this.weight = weight;
    }
    public static void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }
    public abstract double Price();
    public static double totalprice(Fruits[] fruits) {
        double total = 0;
        for (Fruits fruit : fruits) {
            total += fruit.Price();
        }
        return total;
    }
}