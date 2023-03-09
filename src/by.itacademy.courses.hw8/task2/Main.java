package by.itacademy.courses.hw8.task2;

public class Main {
    public static void main(String[] args) {
        User user=new User("Andrew","123456");
        User.Query query=user.new Query();
        query.printToLog();
    }
}
