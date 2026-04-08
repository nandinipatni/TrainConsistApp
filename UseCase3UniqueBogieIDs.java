import java.util.*;

/**
 * Train Consist Management App
 * Use Case 3: Track Unique Bogie IDs using HashSet
 * @author nandinipatni
 * @version 3.0
 */

public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=====================================\n");

        // Create HashSet
        Set<String> bogies = new HashSet<>();

        // ADD IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (should be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Bogie IDs after insertion (duplicates removed automatically):");
        System.out.println(bogies);

        System.out.println("\nTotal Unique Bogies: " + bogies.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}