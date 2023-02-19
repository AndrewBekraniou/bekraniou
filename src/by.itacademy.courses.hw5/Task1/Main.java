package by.itacademy.courses.hw5.Task1;

public class Main {
    public static void main(String[] args) {
        Person vasy = new Person();
        vasy.move();
        vasy.talk();

        Person men = new Person();
        men.fullName = "Andrew";
        men.age = 40;
        System.out.println(men.getInfo());

        Person men1 = new Person();
        System.out.println(men1.getInfo());
    }
}


