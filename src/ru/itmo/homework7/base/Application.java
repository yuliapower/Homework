package ru.itmo.homework7.base;

import ru.itmo.homework7.Director;
import ru.itmo.homework7.Pupil;
import ru.itmo.homework7.School;
import ru.itmo.homework7.Teacher;

public class Application {
    public static void main(String[] args) {


        Director director1 = new Director("Kate", 45);
        Teacher teacher1 = new Teacher("lily", 34, "History", 35);
        Teacher teacher2 = new Teacher("Ula", 344, "Algebra", 35);
        Pupil pupil1 = new Pupil("Ivanov", 13, "Algebra", 6);
        Pupil pupil2 = new Pupil("Max", 18, "History", 6);
        School school1 = new School("24",director1,new Teacher[]{teacher1,teacher2},new Pupil[]{pupil1,pupil2});
        System.out.println(school1);
        school1.dayAtSchool();
        System.out.println(school1);


    }
}
