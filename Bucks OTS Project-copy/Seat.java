import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Seat {
    private final int seatNumber;
    private boolean reserved;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.reserved = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserveSeat(Customer customer) {
        reserved = true;
        // Additional logic if needed
    }

    public void releaseSeat() {
        reserved = false;
        // Additional logic if needed
    }
}
