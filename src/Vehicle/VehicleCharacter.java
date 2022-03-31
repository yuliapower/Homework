package Vehicle;

public abstract class VehicleCharacter {
    protected String colour;
    protected String manufacturer;
    protected int condition;

    public VehicleCharacter(String colour, String manufacturer, int condition) {
        setColour(colour);
        setManufacturer(manufacturer);
        setCondition(condition);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour == null) {
            throw new IllegalArgumentException("Вы ввели пустое значение, укажите цвет трансортного средства");
        }
        this.colour = colour;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Вы ввели пустое значение, укажите компанию производителя транспортного средства");
        }
        this.manufacturer = manufacturer;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if (condition < 1 || condition > 10) {
            throw new IllegalArgumentException("Состояние транспортного средства должно быть в диапозоне от 1 до 10");
        }
        this.condition = condition;
    }

    public abstract void repair();

    public void changeColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "VehicleCharacter{" +
                "colour='" + colour + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", condition=" + condition +
                '}';
    }
}
