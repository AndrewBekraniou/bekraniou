package by.itacademy.courses.hw8.task3;

import java.util.Scanner;
public class ClothesShop {
    Scanner in = new Scanner(System.in);
    public void searchSize(Clothes[] clothes) {
        Sizes[] sizeAll = Sizes.values();
        System.out.print("Размеры одежды: ");
        for (Sizes size : sizeAll) {
            System.out.print(size + " ");
        }
        System.out.println();
        System.out.print("Введите Ваш размер одежды: ");
        String sizeInput = in.nextLine();
        if (sizeInput.equals("XXS") || sizeInput.equals("XS") || sizeInput.equals("S") || sizeInput.equals("M") || sizeInput.equals("L") || sizeInput.equals("XL") || sizeInput.equals("XXL") || sizeInput.equals("XXXL")) {
            for (Clothes clothe : clothes) {
                if (sizeInput.equalsIgnoreCase(clothe.size.name())) {
                    System.out.println("В наличии: " + clothe.name + "; размер: " + clothe.size + "; Цвет: " + clothe.color + "; Цена: " + clothe.cost);
                }
            }
        } else {
            System.out.println("нет в наличии или неверно указан размер");
        }
    }
    public void searchcolor(Clothes[] clothes) {

        System.out.print("Введите цвет одежды: ");
        String colorInput = in.nextLine();
        if (colorInput.equals("черный") || colorInput.equals("синий") || colorInput.equals("красный") || colorInput.equals("желтый") || colorInput.equals("белый") || colorInput.equals("зеленый")) {
            for (Clothes clothe : clothes) {
                if (colorInput.equals(clothe.color)) {
                    System.out.println("В наличии: " + clothe.name + "; размер: " + clothe.size + "; Цвет: " + clothe.color + "; Цена: " + clothe.cost);
                }
            }
        } else {
            System.out.println("нет в наличии или неверно указан цвет");
        }
    }
    public void dress(Clothes[] clothes) {
        System.out.println();
        System.out.println("Список одежды (в наличии): ");
        for (Clothes clothe : clothes) {
            System.out.println(clothe);
        }
    }
}

