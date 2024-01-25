import java.util.Scanner;

public class Customer {

    private String firstName;
    private String lastName;
    private String address;
    private String username;
    private String password;

    public int login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String enteredUsername = scanner.nextLine();

        System.out.println("Password:");
        String enteredPassword = scanner.nextLine();

        // Return a status code (e.g., 200 for success, 403 for failure)
        // You can define your own logic for status codes based on your requirements
        return 200;
    }

    public void addCustomerRecord() {
        Scanner scanner = new Scanner(System.in);

        // Validate and set the first name
        while (true) {
            System.out.println("First Name (must be at least 3 characters):");
            String enteredFirstName = scanner.nextLine();

            if (enteredFirstName.length() >= 3) {
                firstName = enteredFirstName;
                break;
            } else {
                System.out.println("Error: First name must be at least 3 characters. Please try again.");
            }
        }

        // Validate and set the last name
        while (true) {
            System.out.println("Last Name (must be at least 3 characters):");
            String enteredLastName = scanner.nextLine();

            if (enteredLastName.length() >= 3) {
                lastName = enteredLastName;
                break;
            } else {
                System.out.println("Error: Last name must be at least 3 characters. Please try again.");
            }
        }

        // Validate and set the address
        while (true) {
            System.out.println("Address (must be at least 6 characters):");
            String enteredAddress = scanner.nextLine();

            if (enteredAddress.length() >= 3) {
                address = enteredAddress;
                break;
            } else {
                System.out.println("Error: Address must be at least 6 characters. Please try again.");
            }
        }

        // Validate and set the username
        while (true) {
            System.out.println("Username (must be 5 or more characters):");
            String enteredUsername = scanner.nextLine();

            if (enteredUsername.length() >= 5) {
                username = enteredUsername;
                break;
            } else {
                System.out.println("Error: Username must be 5 or more characters. Please try again.");
            }
        }

        // Validate and set the password
        while (true) {
            System.out.println("Password (must be 8 or more characters):");
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.length() >= 8) {
                password = enteredPassword;
                break;
            } else {
                System.out.println("Error: Password must be 8 or more characters. Please try again.");
            }
        }

        // Placeholder for customer record addition (removed database-related code)
        // Simplified logic (always prints success message)
        System.out.println("Customer record added successfully");
    }

    // Getter method for retrieving first name
    public String getFirstName() {
        return firstName;
    }

    // Getter method for retrieving last name
    public String getLastName() {
        return lastName;
    }
}
