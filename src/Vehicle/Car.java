package Vehicle;

public class Car extends VehicleCharacter {
    private int number;

    public Car(String colour, String manufacturer, int condition, int number) {
        super(colour, manufacturer, condition);
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Номер машины не может быть отрицательным");
        }
        this.number = number;
    }

    @Override
    public void repair() {
        condition += 2;
    }

    @Override
    public void changeColour(String colour) {
        super.changeColour(colour);
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", colour='" + colour + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", condition=" + condition +
                '}';
    }
}
