import java.util.ArrayList;
import java.util.List;

public class Show {

    private int id;
    private String name;
    private String date;
    private String time;
    private String description;
    private List<Seat> seatingChart;

    public Show(int id, String name, String date, String time, String description) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.description = description;
        this.seatingChart = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public List<Seat> getSeatingChart() {
        return seatingChart;
    }

    public void createShow() {
        simulateDatabaseInteraction("Show created: " + this, this::allocateSeatingChart);
    }

    public void editShow(Show updatedShow) {
        simulateDatabaseInteraction("Show updated: " + updatedShow, () -> {
            // Update show details
            this.name = updatedShow.name;
            this.date = updatedShow.date;
            this.time = updatedShow.time;
            this.description = updatedShow.description;
            // No need to update seating chart in this example
        });
    }

    public void deleteShow() {
        simulateDatabaseInteraction("Show deleted: " + this, this::deleteSeatingChart);
    }

    private void simulateDatabaseInteraction(String successMessage, Runnable action) {
        try {
            action.run();
            System.out.println(successMessage);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void allocateSeatingChart() {
        // Simulate the process of creating and allocating seats
        for (int i = 1; i <= 30; i++) {
            seatingChart.add(new Seat(i));
        }
        System.out.println("Seating chart allocated for show: " + this);
    }

    private void deleteSeatingChart() {
        // Simulate the process of deleting the seating chart
        seatingChart.clear();
        System.out.println("Seating chart deleted for show: " + this);
    }
}
