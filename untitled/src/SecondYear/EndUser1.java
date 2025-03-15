package SecondYear;
import java.util.Scanner;
// Interface for transport
interface ITransport1 {
    double calCost();
    double calTime();
}

// Concrete classes implementing ITransport1
class Train1 implements ITransport1 {
    public double calCost() {
        return 1000;
    }

    public double calTime() {
        return 8;
    }
}

class Flight1 implements ITransport1 {
    public double calCost() {
        return 4000;
    }

    public double calTime() {
        return 4;
    }
}

class Ship1 implements ITransport1 {
    public double calCost() {
        return 2000;
    }

    public double calTime() {
        return 10;
    }
}

class Car1 implements ITransport1 {
    public double calCost() {
        return 1500;
    }

    public double calTime() {
        return 6;
    }
}

// Abstract Factory Class
abstract class TransportFactory1 {
    public abstract ITransport1 createTransport(); // Factory method
}

// Concrete Factories for each transport type
class TrainLogistics1 extends TransportFactory1 {
    @Override
    public ITransport1 createTransport() {
        return new Train1();
    }
}

class FlightLogistics1 extends TransportFactory1 {
    @Override
    public ITransport1 createTransport() {
        return new Flight1();
    }
}

class ShipLogistics1 extends TransportFactory1 {
    @Override
    public ITransport1 createTransport() {
        return new Ship1();
    }
}

class CarLogistics1 extends TransportFactory1 {
    @Override
    public ITransport1 createTransport() {
        return new Car1();
    }
}


public class EndUser1 {
    public static void main(String[] args) {
        // Choose transport based on user input
        TransportFactory1 factory;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice:");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                factory = new TrainLogistics1();
                break;
            case 2:
                factory = new FlightLogistics1();
                break;
            case 3:
                factory = new ShipLogistics1();
                break;
            case 4:
                factory = new CarLogistics1();
                break;
            default:
                throw new IllegalArgumentException("Invalid transport choice");
        }

        // Create transport and print its details
        ITransport1 transport = factory.createTransport();
        System.out.println("Cost: " + transport.calCost());
        System.out.println("Time: " + transport.calTime());
        
    }
}