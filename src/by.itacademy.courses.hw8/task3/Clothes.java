package by.itacademy.courses.hw8.task3;

import java.util.Objects;

public class Clothes {
    public String name;
    public Sizes size;
    public String color;
    public double cost;

    public Clothes(String name, Sizes size, String color, double cost) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;
        Clothes clothes = (Clothes) o;
        return Double.compare(clothes.cost, cost) == 0 && Objects.equals(name, clothes.name) && size == clothes.size && Objects.equals(color, clothes.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, size, color, cost);
    }
}



