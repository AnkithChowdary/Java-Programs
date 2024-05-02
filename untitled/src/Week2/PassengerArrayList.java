package Week2;
import java.util.ArrayList;
import java.util.Scanner;
public class PassengerArrayList {



        static ArrayList<Passengers> passengersList = new ArrayList<>();

        public static void main(String[] args) {
            int choice = 1; // Start with a value that ensures entering the loop
            Scanner scanner = new Scanner(System.in);

            while (choice != 3) {
                System.out.println("1. Add\n2. Display\n3. Exit");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addPassenger(scanner);
                        break;
                    case 2:
                        displayPassengers();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }

        static void addPassenger(Scanner scanner) {
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter mobile number: ");
            long mobileNumber = scanner.nextLong();
            System.out.print("Enter distance: ");
            int distance = scanner.nextInt();

            passengersList.add(new Passengers(name, mobileNumber, distance));
        }

        static void displayPassengers() {
            if (passengersList.isEmpty()) {
                System.out.println("No passengers added yet.");
            } else {
                for (Passengers passenger : passengersList) {
                    System.out.println(passenger);
                }
            }
        }
    }


