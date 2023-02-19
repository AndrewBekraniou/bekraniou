package by.itacademy.courses.hw5.Task2;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.number = 123456;
        phone1.model = "Apple";
        phone1.weight = 100;

        Phone phone2 = new Phone();
        phone2.number = 654321;
        phone2.model = "Samsung";
        phone2.weight = 150;

        System.out.println();
        phone1.receiveCall();
        phone1.getNumber();

        System.out.println();
        phone2.receiveCall();
        phone2.getNumber();
        System.out.println();

        Phone.sendMessage(phone1.number, phone2.number);
        Phone.receiveCall(phone1.name, phone2.number);

        System.out.println("Номер телефон: "+phone1.number + " Модель: " + phone1.model + " Вес: " + phone1.weight);
        System.out.println("Номер телефон: "+phone2.number + " Модель: " + phone2.model + " Вес: " + phone2.weight);
        }
}
