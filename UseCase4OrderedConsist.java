import java.util.*;

/**
 * Train Consist Management App
 * Use Case 4: Maintain Ordered Bogie Consist
 * @author nandinipatni
 * @version 4.0
 */

public class UseCase4OrderedConsist {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=====================================\n");

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // ADD bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // INSERT at position
        train.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry at position 2:");
        System.out.println(train);

        // REMOVE first and last
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);

        System.out.println("\nUC4 operations completed successfully...");
    }
}