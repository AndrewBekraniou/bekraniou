package by.itacademy.courses.hw6;

public class Task1 {
    public static void main(String[] args) {
        String nstroka = "  удалить все пробелы   в начале и   конце а между словами   оставить    один пробел ";
        String formatstr = nstroka.replaceAll("^\\s+|\\s+$","").replaceAll("\\s+"," ");
        System.out.println(formatstr);
    }
}
