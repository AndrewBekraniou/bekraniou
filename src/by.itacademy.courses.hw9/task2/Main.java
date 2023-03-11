package by.itacademy.courses.hw9.task2;
public class Main {
    public static void main(String[] args) {
        String firstelement = "элемент";
        int secondelement = 12345;
        Pair<String, Integer> pair = new Pair<>(firstelement, secondelement);
        System.out.println("Вывод 1 элемента= "+pair.getFirstelement());
        System.out.println("Вывод 2 элемента= "+pair.getSecondelement());

        System.out.println("Меняем местами элементы: "+pair.swap());

        System.out.println("Замена элементов на новые:");
        pair.setFirstelement("новый элемент");
        System.out.println(pair.getFirstelement());
        pair.setSecondelement(54321);
        System.out.println(pair.getSecondelement());
    }
}