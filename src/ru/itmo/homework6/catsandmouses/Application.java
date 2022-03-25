package ru.itmo.homework6.catsandmouses;

public class Application {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 23, 10,100);
        Cat cat2 = new Cat("Vasya2", 20, 7,100);
        Mouse mouse1 = new Mouse(20);
        cat1.catchMouses(mouse1);
        Mouse mouse2 = new Mouse(19);
        cat2.catchMouses(mouse2);
        Mouse mouse3 = new Mouse(19);
        cat2.catchMouses(mouse3);
        cat1.attackCat(cat2);
        System.out.println(cat1.toString());
    }
}
