package by.itacademy.courses.hw5.task1;

public class Person {
    public String fullName;
    public int age;
    public void move() {
        System.out.println(fullName + " move");
    }
    public void talk() {
        System.out.println(fullName + " talk");
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




