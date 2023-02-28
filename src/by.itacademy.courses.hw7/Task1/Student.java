package by.itacademy.courses.hw7.Task1;

public class Student extends Univer {
    public Student(String name, String surname, int numcourse, String namegroup, double averagerating) {
        super(name, surname, numcourse, namegroup, averagerating);
    }
    public String moneystudent() {
        if (averagerating == 5.0) {
            return "100$";
        } else {
            return "80$";
        }
    }
        public String Infostudent () {
            return "Имя:" + name + ",Фамилия:" + surname + ",Номер курса:" + numcourse + ",Название группы:" + namegroup + ",Средняя оценка:" + averagerating+ ",Размер стипендии:"+moneystudent();
        }
    }

