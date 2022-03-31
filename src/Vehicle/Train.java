package Vehicle;

public class Train extends VehicleCharacter{
    private int countVan;

    public Train(String colour, String manufacturer, int condition, int countVan) {
        super(colour, manufacturer, condition);
        setCountVan(countVan);
    }

    public int getCountVan() {
        return countVan;
    }

    public void setCountVan(int countVan) {
        if (countVan<1){
            throw new IllegalArgumentException("У поезда не может быть меньше 1 вагона");
        }
        this.countVan = countVan;
    }

    @Override
    public void repair() {
        System.out.println("Поезд отремонтировать нельзя");
    }

    @Override
    public void changeColour(String colour) {
        super.changeColour(colour);
    }

    @Override
    public String toString() {
        return "Train{" +
                "countVan=" + countVan +
                ", colour='" + colour + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", condition=" + condition +
                '}';
    }
}
