import java.util.ArrayList;

public class database {
    private static ArrayList<Vehicle> listVehicle = new ArrayList<Vehicle>();
    public static void add (Vehicle vehicle) {
        listVehicle.add(vehicle);
    }
    public static ArrayList getalldatabase() {
        return listVehicle;
    }

    
}
