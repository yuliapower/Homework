package ru.itmo.homework6.catsandmouses;

public class Mouse {
    private int speedMouse;

    public Mouse(int vMouse) {
        setSpeedMouse(vMouse);

    }

    public int getSpeedMouse() {
        return speedMouse;
    }

    public void setSpeedMouse(int vMouse) {
        if (vMouse<0){
            throw new IllegalArgumentException("Скорость мыши не может быть отрицательной");
        }
        this.speedMouse = vMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speedMouse=" + speedMouse +
                '}';
    }
}
