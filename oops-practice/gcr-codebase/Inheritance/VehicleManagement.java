// Interface
interface Refuelable {
    void refuel();
}

// Superclass
class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass 1
class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging...");
    }
}

// Subclass 2
class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled...");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle("Tesla Model 3", 220);

        PetrolVehicle pv =
                new PetrolVehicle("Honda City", 180);

        System.out.println("Electric Vehicle Details:");
        ev.displayInfo();
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle Details:");
        pv.displayInfo();
        pv.refuel();
    }
}
