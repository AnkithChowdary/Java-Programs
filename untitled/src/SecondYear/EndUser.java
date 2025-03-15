package SecondYear;

import java.util.Scanner;

interface ITransport {
    double cost();
    double calTime();
}

class Train implements ITransport {
    public double cost() {
        return 1000;
    }

    public double calTime() {
        return 8;
    }
}

class Flight implements ITransport {
    public double cost() {
        return 4000;
    }

    public double calTime() {
        return 4;
    }
}

class Ship implements ITransport {
    public double cost() {
        return 4000;
    }

    public double calTime() {
        return 10;
    }
}

class TransportFactory {
    public static ITransport getTransport(int choice) {
        switch (choice) {
            case 1:
                return new Train();
            case 2:
                return new Flight();
            case 3:
                return new Ship();
            default:
                return null;
        }
    }
}

public class EndUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a mode of transport:");
        System.out.println("1. Train");
        System.out.println("2. Flight");
        System.out.println("3. Ship");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        ITransport transport = TransportFactory.getTransport(choice);
        
        if (transport != null) {
            System.out.println("Transport selected:");
            System.out.println("Cost: " + transport.cost());
            System.out.println("Time: " + transport.calTime() + " hours");
        } else {
            System.out.println("Invalid choice. Please select a valid transport option.");
        }
        sc.close();
    }
}
