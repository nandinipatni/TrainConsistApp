public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("====================================\n");

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Search key
        String searchId = "BG309";

        // Step 3: Display all IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Step 4: Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop early
            }
        }

        // Step 5: Result
        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " FOUND");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND");
        }
    }
}