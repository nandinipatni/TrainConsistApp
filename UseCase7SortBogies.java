import java.util.*;

/**
 * Train Consist Management App
 * Use Case 7: Sort Bogies by Capacity using Comparator
 * @author nandinipatni
 * @version 7.0
 */

public class UseCase7SortBogies {

    // Bogie class (custom object)
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
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("=====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:\n");
        for (Bogie b : bogies) {
            b.display();
        }

        // SORT using Comparator (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by capacity):\n");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nUC7 operations completed successfully...");
    }
}