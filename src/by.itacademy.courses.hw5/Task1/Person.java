package by.itacademy.courses.hw5.Task1;

public class Person {
    public String fullName;
    public int age;
    String name = "Vasy";
    public void move() {
        System.out.println(name + " move");
    }
    public void talk() {
        System.out.println(name + " talk");
    }
    public Person() {
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public String getInfo() {
        return fullName + "," + age;
    }

}




