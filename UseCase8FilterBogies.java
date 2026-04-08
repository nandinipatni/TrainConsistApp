import java.util.*;
import java.util.stream.*;

/**
 * Train Consist Management App
 * Use Case 8: Filter Passenger Bogies using Streams
 * @author nandinipatni
 * @version 8.0
 */

public class UseCase8FilterBogies {

    // Reusing Bogie class from UC7
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
        System.out.println(" UC8 - Filter Passenger Bogies ");
        System.out.println("=====================================\n");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("All Bogies:\n");
        bogies.forEach(b -> b.display());

        // FILTER using Stream
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)   // CONDITION 🔥
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (capacity > 60):\n");
        filtered.forEach(b -> b.display());

        System.out.println("\nUC8 operations completed successfully...");
    }
}