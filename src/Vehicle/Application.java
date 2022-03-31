package Vehicle;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("white", "mazda", 5, 345);
        car1.repair();
        car1.changeColour("green");
        System.out.println(car1);

        Bicycle bicycle1 = new Bicycle("black", "Electra", 8, "city");
        bicycle1.repair();
        System.out.println(bicycle1);

        Train train1 = new Train("blue", "rzd", 7, 25);
        train1.repair();
        System.out.println(train1);

        Workshop workshop1 = new Workshop(10);
        workshop1.addVehicle(train1);
        workshop1.addVehicle(car1);
        workshop1.addVehicle(bicycle1);
        System.out.println(workshop1);

        workshop1.service();
        System.out.println(workshop1);
        workshop1.paint("grey",car1);
        System.out.println(workshop1);
    }
}
