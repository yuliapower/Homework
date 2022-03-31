package Vehicle;

public class Bicycle extends VehicleCharacter {
  private String type;

    public Bicycle(String colour, String manufacturer, int condition, String type) {
        super(colour, manufacturer, condition);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type==null){
            throw new IllegalArgumentException("Вы ввели пустое значение, укажите тип транспортного средства");
        }
        this.type = type;
    }


    @Override
    public void repair() {
        condition += 1;
    }

    @Override
    public void changeColour(String colour) {
        super.changeColour(colour);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", condition=" + condition +
                '}';
    }
}
