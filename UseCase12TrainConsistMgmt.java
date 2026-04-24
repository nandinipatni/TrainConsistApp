import java.util.*;
import java.util.stream.*;

public class UseCase12TrainConsistMgmt {

    // Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " → " + cargo;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Display bogies
        System.out.println("Goods Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Safety check using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                        b.cargo.equals("Petroleum")
                );

        // Step 4: Output result
        System.out.println("\nTrain Safety Status: " + (isSafe ? "SAFE" : "UNSAFE"));
    }
}