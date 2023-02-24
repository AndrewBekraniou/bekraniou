package by.itacademy.courses.hw6;

public class Task4 {
    public static void main(String[] arg) {
        StringBuilder chislo = znaceniechisla(3, 56);
        System.out.println(chislo);
        zamena(chislo);
        System.out.println(chislo);
    }
    public static StringBuilder znaceniechisla(int x, int y) {
        StringBuilder vivod = new StringBuilder();
        vivod.append(x).append("+").append(y).append("=").append(x + y).append("\n");
        vivod.append(x).append("-").append(y).append("=").append(x - y).append("\n");
        vivod.append(x).append("*").append(y).append("=").append(x * y);
        return vivod;
    }
    public static StringBuilder zamena(StringBuilder chislo) {
        int index = chislo.indexOf("=");
        chislo.deleteCharAt(index);
        chislo.insert(index, " равно ");
        int index1 = chislo.indexOf("=");
        chislo.deleteCharAt(index1);
        chislo.insert(index1, " равно ");
        int index2 = chislo.indexOf("=");
        chislo.deleteCharAt(index2);
        chislo.insert(index2, " равно ");
        return chislo;
    }
}
