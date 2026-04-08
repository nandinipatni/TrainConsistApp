import java.util.*;

/**
 * Train Consist Management App
 * Use Case 5: Preserve Insertion Order using LinkedHashSet
 * @author nandinipatni
 * @version 5.0
 */

public class UseCase5LinkedHashSetFormation {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=====================================\n");

        // LinkedHashSet → order + uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ADD bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate (should be ignored)
        formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nTotal Bogies: " + formation.size());

        System.out.println("\nUC5 operations completed successfully...");
    }
}