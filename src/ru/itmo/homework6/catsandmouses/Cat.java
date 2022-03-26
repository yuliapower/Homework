package ru.itmo.homework6.catsandmouses;

import java.util.Arrays;

public class Cat {
    private String name;
    private int speedCat;
    private int weight;
    private Mouse[] mouses;
//Кот хранит информацию о пойманных мышах (максимум о 100).
//Кот ловит мышь, только, если его скорость выше, чем у мыши.
//Кот может напасть на другого кота и, если он больше противника (по весу),
// то может отобрать его мышей (если скорость мыши выше, чем скорость кота,
// она убежит).


    public Cat(String name, int vCat, int weight, int mouses) {
        setName(name);
        setSpeedCat(vCat);
        setWeight(weight);
        if (mouses > 100) {
            System.out.println("Кот не может хранить больше 100 мышей");
            return;
        }
        this.mouses = new Mouse[mouses];
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Вы ввели пустое значение имени кота");
        }
        this.name = name;
    }

    public void setSpeedCat(int speedCat) {
        if (speedCat < 0) {
            throw new IllegalArgumentException("Скорость кота не может быть отрицательной");
        }
        this.speedCat = speedCat;
    }

    public int getSpeedCat() {
        return speedCat;
    }

    public Mouse[] getMouses() {
        return mouses;
    }

    public void setMouses(Mouse[] mouses) {
        this.mouses = mouses;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Вес кота не может быть отрицательным");
        }
        this.weight = weight;
    }

    public void catchMouses(Mouse mouse) {
        if (getSpeedCat() > mouse.getSpeedMouse()) {
            for (int i = 0; i < mouses.length; i++) {
                if (mouses[i] == null) {
                    mouses[i] = mouse;
                    return;
                }
            }
        }
    }

    public void attackCat(Cat cat) {
        if (this == cat) {
            System.out.println("Кот не может напасть сам на себя");
            return;
        }

        if (weight > cat.getWeight()) {
            // Mouse[] mouses2 = cat.getMouses();
            for (int i = 0; i < cat.getMouses().length; i++) {
                if (cat.getMouses()[i] != null) {
                    catchMouses(cat.getMouses()[i]);
                    cat.getMouses()[i] = null;
                }
            }
        } else {
            System.out.println("Кот не может поймать другого кота");
        }
    }


    public void deleteMouses(Mouse mouse) {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", speedCat=" + speedCat +
                ", weight=" + weight +
                ", mouses=" + Arrays.toString(mouses) +
                '}';
    }


}
