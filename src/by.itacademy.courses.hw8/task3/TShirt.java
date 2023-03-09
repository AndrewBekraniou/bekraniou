package by.itacademy.courses.hw8.task3;
public class TShirt extends Clothes {
    public TShirt(String name, Sizes size, String color, double cost) {
        super(name, size, color, cost);
    }
    @Override
    public String toString() {
        return "Майка - " + "размер " + size + "; цена " + cost + " $" + "; цвет " + color;
    }
}

