package ru.itmo.homework6.product;

import java.util.Arrays;

public class MyProduct {
    // Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
    // Реализовать метод, который принимает на Продукт и добавляет его в список,
    // если характеристики продукта полностью соответствуют заявленным разрешениям,
    // в противном случае сообщить, по какой причине продукт не может быть добавлен
    // в список (например, слишком большое содержание калорий)
    //Реализовать метод, который выводит названия всех продуктов из списка


    private int maxProteins;
    private int maxFats;
    private int maxCarbohydrates;
    private int calories;
    private Product[] products;


    public MyProduct(int maxProteins, int maxFats, int maxCarbohydrates, int calories, int countProduct) {
        this.maxProteins = maxProteins;
        this.maxFats = maxFats;
        this.maxCarbohydrates = maxCarbohydrates;
        this.calories = calories;
        this.products = new Product[countProduct];
    }

    public void setCalories(int calories) {
        if (calories>5000){
            throw new IllegalArgumentException();
        }
        this.calories = calories;
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Вы ввели нулевое значение");
        }
        if (product.getProteins() > maxProteins ){
            System.out.println("Слишков много белков");
            return;
        }
        if (product.getFats() > maxFats ){
            System.out.println("Слишков много жиров");
            return;
        }
        if (product.getCarbohydrates() > maxCarbohydrates ){
            System.out.println("Слишков много углеводов");
            return;
        }
        if (product.getCalories() > calories){
            System.out.println("слишком большое содержание калорий");
            return;
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
    }

    public void printName(){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName());
        }

    }

    @Override
    public String toString() {
        return "MyProduct{" +
                "maxProteins=" + maxProteins +
                ", maxFats=" + maxFats +
                ", maxCarbohydrates=" + maxCarbohydrates +
                ", calories=" + calories +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
