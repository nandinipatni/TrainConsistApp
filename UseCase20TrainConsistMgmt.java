public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC20 - Exception Handling in Search");
        System.out.println("====================================\n");

        // Step 1: Create bogie array (EMPTY case)
        String[] bogieIds = {};

        // Step 2: Search key
        String searchId = "BG101";

        // 🔥 STEP 3: FAIL-FAST VALIDATION
        if (bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train");
        }

        // Step 4: Linear search (runs ONLY if data exists)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        // Step 5: Result
        if (found) {
            System.out.println("Bogie ID " + searchId + " FOUND");
        } else {
            System.out.println("Bogie ID " + searchId + " NOT FOUND");
        }

        System.out.println("\nUC20 execution completed.");
    }
}