package getterandsetters;

import java.util.Scanner;

class Vehicle {
    protected int numberOfWheels;
    protected String make;
    protected String model;
    protected String fuel;

    public Vehicle() {
        numberOfWheels = 4; // Default value
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Fuel type: " + fuel);
    }
}

class Car extends Vehicle {
    public Car() {
        super(); // Call the constructor of the superclass (getterandsetters.Vehicle)
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter make of the car:");
        String make = scanner.nextLine();

        System.out.println("Enter model of the car:");
        String model = scanner.nextLine();

        System.out.println("Enter fuel type of the car:");
        String fuel = scanner.nextLine();

        Car car = new Car();
        car.setMake(make);
        car.setModel(model);
        car.setFuel(fuel);

        System.out.println("\ngetterandsetters.Car Information:");
        car.displayInfo();

        scanner.close();
    }
}
