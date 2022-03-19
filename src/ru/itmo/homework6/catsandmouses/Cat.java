package ru.itmo.homework.catsandmouses;

public class Cat {
    private String name;
    private int vCat;
    private int weight;
    private Mouse[] mouses;
//Кот хранит информацию о пойманных мышах (максимум о 100).
//Кот ловит мышь, только, если его скорость выше, чем у мыши.
//Кот может напасть на другого кота и, если он больше противника (по весу),
// то может отобрать его мышей (если скорость мыши выше, чем скорость кота,
// она убежит).


    public Cat(String name, int vCat, int weight, Mouse[] mouses) {
        this.name = name;
        this.vCat = vCat;
        this.weight = weight;
        this.mouses = mouses;
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
        this.weight = weight;
    }

    public void catchMouses(Mouse mouse) {
        if (vCat > mouse.getvMouse()) {
            for (int i = 0; i < mouses.length; i++) {
                if (mouses[i] == null) {
                    mouses[i] = mouse;
                    return;
                }
            }
        }
    }

    public void attackCat(Cat cat) {
        if (weight > cat.getWeight()) {
            Mouse[] mouses2 = cat.getMouses();
            for (int i = 0; i < mouses2.length; i++) {
                if (mouses2[i] != null) {
                    catchMouses(mouses2[i]);
                    cat.getMouses()[i] = null;
                }else {
                    System.out.println("Кот не может поймать другого кота");
                }
            }
        }
    }


}
