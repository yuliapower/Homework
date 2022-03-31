package Vehicle;

import java.util.Arrays;

public class Workshop {
    private VehicleCharacter[] vehicles;

    public Workshop(int countTransport) {
        this.vehicles = new VehicleCharacter[countTransport];
    }

    public void addVehicle(VehicleCharacter vehicleCharacter) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicleCharacter;
                return;
            }
        }
    }

    public void service() {
        for (VehicleCharacter vehicle : vehicles) {
            if (vehicle != null) {
                vehicle.repair();
            }
        }
    }

    public void paint(String colour, VehicleCharacter vehicleCharacter) {
        for (VehicleCharacter vehicle : vehicles) {
            if (vehicle == vehicleCharacter) {
                vehicle.changeColour(colour);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}
