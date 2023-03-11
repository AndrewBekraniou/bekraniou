package by.itacademy.courses.hw5.task1;

public class Main {
    public static void main(String[] args) {
        Person men = new Person("Andrew", 40);
        System.out.println(men.getInfo());
        men.move();
        men.talk();

        Person men1 = new Person();
        System.out.println(men1.getInfo());
    }
}


