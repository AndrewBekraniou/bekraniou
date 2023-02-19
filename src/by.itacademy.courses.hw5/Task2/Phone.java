package by.itacademy.courses.hw5.Task2;

import java.util.Scanner;

public class Phone {
    public int number;
    public String model;
    public int weight;
    String name = "Vasy";

    public void receiveCall() {
        System.out.println("Звонит: " + name);
    }
    public void getNumber() {
        System.out.println(number);
    }
    public static void sendMessage(int num1, int num2) {
        System.out.println(num1 + " ; " + num2);
    }
    public static void receiveCall(String name, int num) {
        System.out.println(name + " - " + num);
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
    public Phone() {
    }
    }

