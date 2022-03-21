package ru.itmo.homework7;

import ru.itmo.homework7.base.MainCharacteristic;

public class Teacher extends MainCharacteristic {
    private String teacherSubject;
    private int teacherLevel;

    public Teacher(String name, int age, String teacherSubject, int teacherLevel) {
        super(name, age);
        if (teacherSubject == null) {
            throw new IllegalArgumentException("Введите название препдаваемого предмета");
        }
        if (teacherLevel < 0) {
            throw new IllegalArgumentException("Навык учителя не может быть отрицательным");
        }
        this.teacherSubject = teacherSubject;
        this.teacherLevel = teacherLevel;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public int getTeacherLevel() {
        return teacherLevel;
    }

    public void teach(Pupil pupil) {
        pupil.study(this);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherSubject='" + teacherSubject + '\'' +
                ", teacherLevel=" + teacherLevel +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
