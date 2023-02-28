package by.itacademy.courses.hw7.Task1;

public class Main {
    public static void main(String[] args) {

        Student[] student = new Student[3];
        student[0] = new Student("Aleksand", "Lukashenko", 1, "MSF", 4.5);
        student[1] = new Student("Vladimir", "Putin", 3, "RTF", 4.1);
        student[2] = new Student("joe", "Biden", 4, "PSF", 5.0);
        {
            System.out.println("Cтуденты:");
        }
        for (int i = 0; i < 3; i++) {

            System.out.println(student[i].Infostudent());
        }
        Aspirant[] aspirant = new Aspirant[3];
        aspirant[0] = new Aspirant("Petr", "Petrov", 1, "MSF", 5.0, "Metall");
        aspirant[1] = new Aspirant("Ivan", "Ivanov", 2, "MSF", 4.0, "Economy");
        aspirant[2] = new Aspirant("Sidr", "Sidorov", 1, "MSF", 3.0, "Atom");
        {
            System.out.println("Аспиранты:");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(aspirant[i].Infoaspirant());
        }
    }
}
