package by.itacademy.courses.hw7.Task3;

public class Main {
    public static void main(String[] args) {

        Fruits.printManufacturerInfo();

        Apple[] apples = {new Apple(2), new Apple(1.5)};
        Pear[] pears = {new Pear(1.2), new Pear(1), new Pear(5)};
        Apricot[] apricots = {new Apricot(1), new Apricot(3), new Apricot(2.8)}; {
            double applestotalprice = Fruits.totalprice(apples);
            double pearstotalprice = Fruits.totalprice(pears);
            double apricotstotalprice = Fruits.totalprice(apricots);
            {
                System.out.println("Стоимость 1 кг яблок: "+Apple.priceKg);
                System.out.println("Стоимость яблок в корзине: "+applestotalprice);
                System.out.println("Стоимость 1 кг груш: "+Pear.priceKg);
                System.out.println("Стоимость груш в корзине: "+pearstotalprice);
                System.out.println("Стоимость 1 кг абрикос: "+Apricot.priceKg);
                System.out.println("Стоимость абрикос в корзине: "+apricotstotalprice);
            }
            System.out.println ("Общая стоимость фруктов: "+(applestotalprice+pearstotalprice+apricotstotalprice));
        }
    }
}