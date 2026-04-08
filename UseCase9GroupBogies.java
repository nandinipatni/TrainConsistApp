import java.util.*;
import java.util.stream.*;

/**
 * Train Consist Management App
 * Use Case 9: Group Bogies by Type
 * @author nandinipatni
 * @version 9.0
 */

public class UseCase9GroupBogies {

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
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("=====================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("All Bogies:\n");
        for (Bogie b : bogies) {
            b.display();
        }

        // GROUPING LOGIC 🔥
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                      .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity → " + b.capacity);
            }

            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}