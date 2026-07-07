import java.util.ArrayList;

public class SmartParkingSlotManager {

    public static void main(String[] args) {

        ArrayList<String> vehicles = new ArrayList<>();

        addVehicle(vehicles, "UP80AB1234");
        addVehicle(vehicles, "DL01CD5678");
        addVehicle(vehicles, "HR26EF9012");

        removeVehicle(vehicles, "DL01CD5678");

        searchVehicle(vehicles, "UP80AB1234");
        searchVehicle(vehicles, "DL01CD5678");

        System.out.println("\nParked Vehicles:");
        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("\nTotal Occupied Parking Slots: " + vehicles.size());
    }

    public static void addVehicle(ArrayList<String> vehicles, String number) {
        vehicles.add(number);
        System.out.println(number + " entered the parking area.");
    }

    public static void removeVehicle(ArrayList<String> vehicles, String number) {
        if (vehicles.remove(number)) {
            System.out.println(number + " exited the parking area.");
        } else {
            System.out.println(number + " not found.");
        }
    }

    public static void searchVehicle(ArrayList<String> vehicles, String number) {
        if (vehicles.contains(number)) {
            System.out.println(number + " is currently parked.");
        } else {
            System.out.println(number + " is not parked.");
        }
    }
}