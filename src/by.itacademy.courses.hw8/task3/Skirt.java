package by.itacademy.courses.hw8.task3;
public class Skirt extends Clothes {
    public Skirt(String name, Sizes size, String color, double cost) {
        super(name, size, color, cost);
    }
    @Override
    public String toString() {
        return "Юбка - " + "размер " + size + "; цена " + cost + " $" + "; цвет " + color;
    }
}

