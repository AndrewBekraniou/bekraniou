package by.itacademy.courses.hw8.task2;

import java.util.Objects;
public class User {
    public String login, password;
    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь: %s, отправил запрос ", User.this, " ");
        }
    }
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

