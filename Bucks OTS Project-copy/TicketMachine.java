import java.util.Scanner;

public class TicketMachine {

    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.enterDetails();
    }

    public void enterDetails() {
        // Create a new Customer instance
        Customer customer = new Customer();

        // Get customer details
        customer.addCustomerRecord();

        // Display available shows (you can customize this based on your requirements)
        displayAvailableShows();

        // Select a show
        String selectedShow = selectShow();

        // Display available seats (you can customize this based on your requirements)
        displayAvailableSeats();

        // Select a seat
        int selectedSeatNumber = selectSeat();

        // Select a seat category
        String selectedSeatCategory = selectSeatCategory();

        // Calculate ticket price
        double ticketPrice = calculateTicketPrice(selectedSeatCategory);

        // Generate and display the ticket
        generateTicket(customer, selectedShow, selectedSeatCategory, ticketPrice);
    }

    private void displayAvailableShows() {
        System.out.println("Available Shows:");
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Reality");
        // Add more shows as needed
    }

    private String selectShow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a show (Enter the show number):");

        int showNumber = scanner.nextInt();
        String selectedShow;

        switch (showNumber) {
            case 1:
                selectedShow = "Comedy";
                break;
            case 2:
                selectedShow = "Drama";
                break;
            case 3:
                selectedShow = "Reality";
                break;
            // Add more cases as needed for additional shows
            default:
                selectedShow = "Unknown Show";
                break;
        }

        System.out.println("Selected Show: " + selectedShow);
        return selectedShow;
    }

    private void displayAvailableSeats() {
        int numSeats = 30;

        System.out.println("Available Seats:");
        for (int i = 1; i <= numSeats; i++) {
            System.out.println(i + ". Seat " + i);
        }
    }

    private int selectSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a seat (Enter the seat number):");

        int seatNumber;
        do {
            seatNumber = scanner.nextInt();
            // Consume the newline character
            scanner.nextLine();

            if (seatNumber < 1 || seatNumber > 30) {
                System.out.println("Invalid seat number. Please enter a number between 1 and 20.");
                System.out.println("Select a seat (Enter the seat number):");
            }
        } while (seatNumber < 1 || seatNumber > 30);

        return seatNumber;
    }

    private String selectSeatCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a seat category (Enter the category number):");
        System.out.println("1. Child (£8)");
        System.out.println("2. Student (£10)");
        System.out.println("3. Senior Citizen (£12)");
        System.out.println("4. Adult (£15)");

        int categoryNumber = scanner.nextInt();
        String selectedSeatCategory;

        switch (categoryNumber) {
            case 1:
                selectedSeatCategory = "Child";
                break;
            case 2:
                selectedSeatCategory = "Student";
                break;
            case 3:
                selectedSeatCategory = "Senior Citizen";
                break;
            case 4:
                selectedSeatCategory = "Adult";
                break;
            default:
                selectedSeatCategory = "Unknown Category";
                break;
        }

        System.out.println("Selected Seat Category: " + selectedSeatCategory);
        return selectedSeatCategory;
    }

    private double calculateTicketPrice(String seatCategory) {
        // Placeholder logic for ticket price calculation
        // You can customize this based on your requirements
        switch (seatCategory) {
            case "Child":
                return 8.0;
            case "Student":
                return 10.0;
            case "Senior Citizen":
                return 12.0;
            case "Adult":
                return 15.0;
            default:
                return 1.0;
        }
    }

    private void generateTicket(Customer customer, String show, String seatCategory, double ticketPrice) {
        System.out.println("=====================================");
        System.out.println("               TICKET                ");
        System.out.println("=====================================");
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Show: " + show);
        System.out.println("Seat Category: " + seatCategory);
        System.out.printf("Ticket Price: £%.2f\n", ticketPrice);
        System.out.println("=====================================");
        System.out.println("        THANK YOU. ENJOY THE SHOW!   ");
        System.out.println("================================");
    }
}
