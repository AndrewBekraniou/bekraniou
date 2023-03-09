package by.itacademy.courses.hw8.task3;
public class Trousers extends Clothes {
    public Trousers(String name, Sizes size, String color, double cost) {
        super(name, size, color, cost);
    }
    @Override
    public String toString() {
        return "Штаны - " + "размер " + size + "; цена " + cost + " $" + "; цвет " + color;
    }
}


