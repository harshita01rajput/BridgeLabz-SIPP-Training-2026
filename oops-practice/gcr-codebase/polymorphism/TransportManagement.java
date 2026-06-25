class Vehicle {
    public String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    public Car(String model) {
        super(model);
    }

    @Override
    public double fuelCost(int km) {
        return km * 6.0;  
    }
}

class Bus extends Vehicle {

    public Bus(String model) {
        super(model);
    }

    @Override
    public double fuelCost(int km) {
        return km * 15.0;  
    }
}

class Bike extends Vehicle {

    public Bike(String model) {
        super(model);
    }

    @Override
    public double fuelCost(int km) {
        return km * 2.5;  
    }
}

class ElectricCar extends Vehicle {

    public ElectricCar(String model) {
        super(model);
    }

    @Override
    public double fuelCost(int km) {
        return km * 1.5;  
    }
}

class TransportManagement {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Honda City"),
                new Bus("Volvo Bus"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tesla")
        };

        int km = 100;

        for (Vehicle v : fleet) {

            System.out.println(
                    v.model + " Fuel Cost = ₹" +
                    v.fuelCost(km)
            );
        }
    }
}