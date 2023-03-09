package by.itacademy.courses.hw8.task1;

public class Main {
    public static void main(String[] args) {
        Food sandwich = new Food("sandwich");
        sandwich.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("sandwich cooking");
            }
        });
        Food eggs = new Food("eggs");
        eggs.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("eggs cooking");
            }
        });
    }
}
