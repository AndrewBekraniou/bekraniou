package by.itacademy.courses.hw5.task2;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.number = 123456;
        phone1.model = "Apple";
        phone1.weight = 200;

        Phone phone2 = new Phone(654321,"Samsung",150);

        Phone phone3 = new Phone(987456,"LG");

        phone1.receiveCall("Andrew");
        phone1.receiveCall("Anna",111111111);
        phone1.getNumber();

        System.out.println();
        phone2.receiveCall("Masha");
        phone2.receiveCall("Katy",222222222);
        phone2.getNumber();

        System.out.println();
        phone3.getNumber();

        System.out.println();
        Phone.sendMessage("77777777");
        Phone.sendMessage("55555555","888888888");

        System.out.println();
        System.out.println("Номер телефон: "+phone1.number + " Модель: " + phone1.model + " Вес: " + phone1.weight);
        System.out.println("Номер телефон: "+phone2.number + " Модель: " + phone2.model + " Вес: " + phone2.weight);
        System.out.println("Номер телефон: "+phone3.number + " Модель: " + phone3.model);
    }
}
