package ru.itmo.homework7.base;

public class MainCharacteristic {
    protected String name;
    protected int age;

    public MainCharacteristic(String name, int age) {
       if (name==null){
           throw new IllegalArgumentException("Необходимо указать имя");
       }
       if (age<=0){
           throw new IllegalArgumentException("Необходимо ввести корректный возраст");
       }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MainCharacteristic{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
