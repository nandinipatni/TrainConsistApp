import java.util.Arrays;

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC17 - Sorting using Arrays.sort()");
        System.out.println("====================================\n");

        // Step 1: Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Step 2: Display original
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 3: Sort using built-in method
        Arrays.sort(bogieNames);

        // Step 4: Display sorted
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}