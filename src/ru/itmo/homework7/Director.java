package ru.itmo.homework7;

import ru.itmo.homework7.base.MainCharacteristic;

public class Director extends MainCharacteristic {


    public Director(String name, int age) {
        super(name, age);
    }

    public void startLessons() {
        System.out.println("Начало занятий 9.00");
    }

    public void finishLessons() {
        System.out.println("Занятия заканчиваются в 18.00" );
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
