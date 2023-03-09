package by.itacademy.courses.hw8.task1;

public class Food {
    public String name;
    public Food(String name) {
        this.name = name;
    }
    public void prepare(Cookable c) {
        c.cook();
    }
}