package by.itacademy.courses.hw7.Task3;

class Apricot extends Fruits {
    static double priceKg = 180;

    public Apricot(double weight) {
        super(weight);
    }
    @Override
    public double Price() {
        return weight * priceKg;
    }

}
