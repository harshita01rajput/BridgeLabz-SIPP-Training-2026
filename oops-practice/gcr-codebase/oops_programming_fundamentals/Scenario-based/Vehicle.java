 public class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;
 
    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

   
    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("----- Cars -----");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    
    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\n----- Bikes -----");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP15A101", "Harshita", "Car");
        vehicles[1] = new Vehicle("UP15A102", "Rahul", "Bike");
        vehicles[2] = new Vehicle("UP15A103", "Priya", "Car");
        vehicles[3] = new Vehicle("UP15A104", "Aman", "Bike");
        vehicles[4] = new Vehicle("UP15A105", "Riya", "Car");
        vehicles[5] = new Vehicle("UP15A106", "Karan", "Bike");
        vehicles[6] = new Vehicle("UP15A107", "Neha", "Car");
        vehicles[7] = new Vehicle("UP15A108", "Vikas", "Bike");
        vehicles[8] = new Vehicle("UP15A109", "Ankit", "Car");
        vehicles[9] = new Vehicle("UP15A110", "Simran", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}