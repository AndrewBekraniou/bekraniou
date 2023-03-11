package by.itacademy.courses.hw9.task1;

public class Calc {
    public static <T extends Number, V extends Number> double sum(T x, V y) {
        return x.doubleValue() + y.doubleValue();
    }
    public static <T extends Number, V extends Number> double multiply(T x, V y) {
        return x.doubleValue() * y.doubleValue();
    }
    public static <T extends Number, V extends Number> double divide(T x, V y) {
        return x.doubleValue() / y.doubleValue();
    }
    public static <T extends Number, V extends Number> double subtraction(T x, V y) {
        return x.doubleValue() - y.doubleValue();
    }
}

