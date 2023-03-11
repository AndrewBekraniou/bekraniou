package by.itacademy.courses.hw5.task2;

public class Phone {
    public int number;
    public String model;
    public int weight;
    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }
    public void getNumber() {
        System.out.println("Номер телефона: "+number);
    }
    public static void sendMessage(String... numbers) {
        for (String x : numbers)
            System.out.println("Отправляем сообщение: " + x);
    }
    public static void receiveCall(String name, int num) {
        System.out.println(name + " - " + num);
    }
    public Phone() {
    }
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
}

