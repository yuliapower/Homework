package ru.itmo.homework6.product;

//Класс Продукт:
//Свойства: название продукта / белки / жиры / углеводы / калории
//Минимум 4 конструктора
//Реализовать необходимые проверки входящих данных
//Создать не менее 4 экземпляров данного класса (объектов)
public class Product {
    private String name;
    private int proteins;
    private int fats;
    private int carbohydrates;
    private int calories;

    public Product(String name) {
        setName(name);
    }

    public Product(int proteins) {
        setProteins(proteins);
    }

    public Product(String name, int proteins, int fats, int carbohydrates) {
        setName(name);
        setFats(fats);
        setProteins(proteins);
        setCarbohydrates(carbohydrates);
        calories = proteins + fats + carbohydrates;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Вы ввели пустое значение");
        }
        this.name = name;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        if (proteins < 0) {
            throw new IllegalArgumentException("Не может быть меньше 0");
        }
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        if (fats < 0) {
            throw new IllegalArgumentException("Не может быть меньше 0");
        }
        this.fats = fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates < 0) {
            throw new IllegalArgumentException("Не может быть меньше 0");
        }
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                '}';
    }
}
