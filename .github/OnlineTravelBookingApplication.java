import java.util.Scanner;

public class OnlineTravelBookingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our online travel booking service!");
        boolean exit = false;
        
        while (!exit) {
            System.out.println("1. Book a flight");
            System.out.println("2. Book a hotel");
            System.out.println("3. View booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    bookFlight();
                    break;
                case 2:
                    bookHotel();
                    break;
                case 3:
                    viewBooking();
                    break;
                case 4:
                    System.out.println("Thank you for using our online travel booking service!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        input.close();
    }
    
    public static void bookFlight() {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter departure city: ");
			String departureCity = input.nextLine();
			System.out.print("Enter arrival city: ");
			String arrivalCity = input.nextLine();
			System.out.print("Enter departure date (MM/DD/YYYY): ");
			String departureDate = input.nextLine();
			System.out.print("Enter number of passengers: ");
			int numPassengers = input.nextInt();
			System.out.println("Your flight from " + departureCity + " to " + arrivalCity + " on " + departureDate + " for " + numPassengers + " passengers has been booked.");
			input.nextLine(); // consume newline character
		}
    }
    
    public static void bookHotel() {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter check-in date (MM/DD/YYYY): ");
			String checkinDate = input.nextLine();
			System.out.print("Enter check-out date (MM/DD/YYYY): ");
			String checkoutDate = input.nextLine();
			System.out.print("Enter number of rooms: ");
			int numRooms = input.nextInt();
			System.out.println("Your hotel reservation for " + numRooms + " room(s) from " + checkinDate + " to " + checkoutDate + " has been booked.");
			input.nextLine(); // consume newline character
		}
    }
    
    public static void viewBooking() {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("1. View flight booking");
			System.out.println("2. View hotel booking");
			System.out.print("Enter your choice: ");
			
			int choice = input.nextInt();
			switch (choice) {
			    case 1:
			        System.out.println("Your flight booking:");
			        // code to retrieve flight booking information from database or file
			        break;
			    case 2:
			        System.out.println("Your hotel booking:");
			        // code to retrieve hotel booking information from database or file
			        break;
			    default:
			        System.out.println("Invalid choice.");
			        break;
			}
		}
    }
}
