import java.util.Scanner;

public class roombooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] rooms = new boolean[3][4];
        int choice;

        System.out.println("Welcome to the Room Booking System!");

        do {
            System.out.println("\n----Menu:----");
            System.out.println("1. View Room Availability");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
        
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewRooms(rooms);
                break;
                case 2:
                    bookRoom(rooms, scanner);
                break;
                case 3:
                    System.out.println("Thank you for using the Room Booking System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice !=3);

        scanner.close();
    }

    public static void viewRooms(boolean[][] rooms) {
        System.out.println("\nRoom Availability:");
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print((rooms[i][j] ?"[Booked]" : "[Available]")+" ");
            }
            System.out.println();
        }

    }
    public static void bookRoom(boolean[][] rooms, Scanner scanner) {
        System.out.print("\nEnter floor number (1-3): ");
        int floor = scanner.nextInt() - 1;
        System.out.print("Enter room number (1-4): ");
        int room = scanner.nextInt() - 1;

        if (floor >= 0 && floor < rooms.length && room >= 0 && room < rooms[floor].length) {
            if (!rooms[floor][room]) {
                rooms[floor][room] = true;
                System.out.println("\nRoom successfully booked!");
            } else {
                System.out.println(" \nSorry!..Room is already booked.");
            }
        } else {
            System.out.println("Invalid floor or room number.");
        }
    }

}
