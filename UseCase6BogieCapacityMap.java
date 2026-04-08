import java.util.*;

/**
 * Train Consist Management App
 * Use Case 6: Map Bogie to Capacity using HashMap
 * @author nandinipatni
 * @version 6.0
 */

public class UseCase6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("=====================================\n");

        // Create HashMap
        Map<String, Integer> capacityMap = new HashMap<>();

        // ADD bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        // DISPLAY using entrySet
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                               " | Capacity: " + entry.getValue());
        }

        System.out.println("\nTotal Bogie Types: " + capacityMap.size());

        System.out.println("\nUC6 operations completed successfully...");
    }
}