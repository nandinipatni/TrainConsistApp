import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================\n");

        // Step 1: Create array (can be unsorted)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort array (MANDATORY for binary search)
        Arrays.sort(bogieIds);

        // Step 3: Search key
        String key = "BG309";

        // Step 4: Display sorted array
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Step 5: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1;   // search left
            } else {
                low = mid + 1;    // search right
            }
        }

        // Step 6: Result
        if (found) {
            System.out.println("\n\nBogie ID " + key + " FOUND");
        } else {
            System.out.println("\n\nBogie ID " + key + " NOT FOUND");
        }
    }
}