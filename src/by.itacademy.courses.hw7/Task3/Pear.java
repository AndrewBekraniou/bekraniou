package by.itacademy.courses.hw7.Task3;


class Pear extends Fruits {
    static double priceKg = 150;

    public Pear(double weight) {
        super(weight);
    }
    @Override
    public double Price() {
        return weight * priceKg;
    }

}
