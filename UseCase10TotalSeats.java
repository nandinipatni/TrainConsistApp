import java.util.*;
import java.util.stream.*;

/**
 * Train Consist Management App
 * Use Case 10: Count Total Seats using reduce()
 * @author nandinipatni
 * @version 10.0
 */

public class UseCase10TotalSeats {

    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public void display() {
            System.out.println(name + " → Capacity: " + capacity);
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC10 - Total Seat Count ");
        System.out.println("=====================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("Bogies in Train:\n");
        for (Bogie b : bogies) {
            b.display();
        }

        // 🔥 CORE LOGIC (FROM YOUR PDF)
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 completed successfully...");
    }
}