import java.util.Random;
import java.util.Scanner;

/**
 * The VenueManager class represents a venue manager who can manage shows.
 * Inherits from the Customer class.
 */
public class VenueManager extends Customer {

    // Private attribute specific to VenueManager
    private String venue;

    /**
     * Adds a new show to the venue.
     */
    public void addShow() {
        try {
            // Generate a random ID for the new show
            int id = new Random().nextInt();

            // Prompt user for show details
            Scanner scanner = new Scanner(System.in);
            System.out.print("Event/show name: ");
            String name = scanner.nextLine();
            System.out.print("Event/show date: ");
            String date = scanner.nextLine();
            System.out.print("Event/show time: ");
            String time = scanner.nextLine();
            System.out.print("Event/show description: ");
            String description = scanner.nextLine();

            // Create a new Show object with the provided details
            Show show = new Show(id, name, date, time, description);

            // Call the createShow method of the Show class to add the show to the database
            show.createShow();
            System.out.println("Event/show added.");
        } catch (Exception e) {
            System.out.println("Error adding event/show: " + e.getMessage());
        }
    }

    /**
     * Edits an existing show in the venue.
     *
     * @param show The show to be edited
     */
    public void editShow(Show show) {
        try {
            // Prompt user for updated show details
            Scanner scanner = new Scanner(System.in);
            System.out.print("Update event/show name: ");
            String name = scanner.nextLine();
            System.out.print("Update event/show date: ");
            String date = scanner.nextLine();
            System.out.print("Update event/show time: ");
            String time = scanner.nextLine();
            System.out.print("Update event/show description: ");
            String description = scanner.nextLine();

            // Create a new Show object with the updated details
            Show updatedShow = new Show(show.getId(), name, date, time, description);

            // Call the editShow method of the Show class to update the show in the database
            show.editShow(updatedShow);
            System.out.println("Event/show updated.");
        } catch (Exception e) {
            System.out.println("Error updating event/show: " + e.getMessage());
        }
    }

    /**
     * Cancels a show in the venue.
     *
     * @param show The show to be canceled
     */
    public void cancelShow(Show show) {
        try {
            // Call the deleteShow method of the Show class to delete the show from the database
            show.deleteShow();
            System.out.println("Event/show canceled.");
        } catch (Exception e) {
            System.out.println("Error canceling event/show: " + e.getMessage());
        }
    }
}
