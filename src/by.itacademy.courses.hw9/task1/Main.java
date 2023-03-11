package by.itacademy.courses.hw9.task1;

public class Main {
    public static void main(String[] args) {
        printResults(getArrayCalc());
    }
    public static double[] getArrayCalc() {
        return new double[]{
                Calc.sum((short) 3, 101L),
                Calc.multiply((byte) 1, 9.0F),
                Calc.divide(5, 3.2D),
                Calc.subtraction( 20L, (short) 10)
        };
    }
    public static void printResults(double[] results) {
        for (double result : results) {
            System.out.println("Результат = " + result + ";");
        }
    }
}


