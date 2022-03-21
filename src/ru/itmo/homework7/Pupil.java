package ru.itmo.homework7;

import ru.itmo.homework7.base.MainCharacteristic;

public class Pupil extends MainCharacteristic {
    private String pupilSubject;
    private int pupilLevel;

    public Pupil(String name, int age, String pupilSubject, int pupilLevel) {
        super(name, age);
        if (pupilSubject == null) {
            throw new IllegalArgumentException("Введите название изучаемого предмета");
        }
        if (pupilLevel < 0) {
            throw new IllegalArgumentException("Уровень знаний ученика не может быть отрицательным");
        }
        this.pupilSubject = pupilSubject;
        this.pupilLevel = pupilLevel;
    }

    public String getPupilSubject() {
        return pupilSubject;
    }

    public int getPupilLevel() {
        return pupilLevel;
    }

    public void study(Teacher teacher) {
        if (pupilLevel < teacher.getTeacherLevel()) {
            pupilLevel += (int) (Math.random() * teacher.getTeacherLevel()) + 1;
            System.out.println("Уровень знаний ученика " +  this.name + " выросло на " + pupilLevel);
        }
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "pupilSubject='" + pupilSubject + '\'' +
                ", pupilLevel=" + pupilLevel +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
