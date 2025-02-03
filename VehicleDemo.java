class Vehicle {
    public void startEngine() {
        System.out.println("Starting a generic vehicle engine...");
    }
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Starting the car engine with a key or button...");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Starting the motorcycle engine with a kick or button...");
    }
}

public class VehicleDemo {
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        System.out.println("Car Test Drive:");
        vehicleTestDrive(myCar);

        System.out.println("\nMotorcycle Test Drive:");
        vehicleTestDrive(myMotorcycle);
    }
}