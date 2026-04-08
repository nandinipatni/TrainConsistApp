import java.util.*;

/**
 * Train Consist Management App
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Demonstrates application entry and initialization of train consist.
 *
 * @author nandinipatni
 * @version 1.0
 */

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("=======================================");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("\nInitial Bogie Count: " + trainConsist.size());

        // Display consist state
        System.out.println("Train consist initialized successfully.");
    }
}