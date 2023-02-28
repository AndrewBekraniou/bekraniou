package by.itacademy.courses.hw7.Task1;

public class Aspirant extends Univer {
    String scienwork;

    public Aspirant(String name, String surname, int numcourse, String namegroup, double averagerating, String scienwork) {
        super(name, surname, numcourse, namegroup, averagerating);
        this.scienwork = scienwork;
    }
    public String moneyaspirant() {
        if (averagerating == 5.0) {
            return "200$";
        } else {
            return "180$";
        }
    }
    public String Infoaspirant() {
        return "Имя:" + name + ",Фамилия:" + surname + ",Номер курса:" + numcourse + ",Название группы:" + namegroup + ",Средняя оценка:" + averagerating + ",Научная работа:" + scienwork+ ",Размер стипендии:" +moneyaspirant();
    }


}
