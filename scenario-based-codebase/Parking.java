import java.util.*;

class Parking {

    public static void menu() {
        System.out.println("1 .Park");
        System.out.println("2. Exit");
        System.out.println("3. Show Occupancy");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 50;
        menu();
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number of vehicles to park: ");
                    int numOfVehicle = sc.nextInt();
                    if (capacity - numOfVehicle >= 0) {
                        capacity -= numOfVehicle;
                        System.out.println("Car parked successfully.");
                        System.out.println();
                        menu();
                    } else {
                        System.out.println("Parking Full");
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                case 3:
                    System.out.println("Current occupancy: " + capacity + " cars");
                    menu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    menu();
            }
        }
    }
}