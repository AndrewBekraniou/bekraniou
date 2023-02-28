package by.itacademy.courses.hw7.Task3;

class Apple extends Fruits {
    static double priceKg = 100;
    public Apple(double weight)
    {
        super(weight); }

    @Override
    public double Price() {
        return weight * priceKg;
    }

}