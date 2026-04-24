import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        // Sample inputs (you can change these)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns (from your doc)
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Validate using matches()
        boolean isTrainValid = trainRegex.matcher(trainId).matches();
        boolean isCargoValid = cargoRegex.matcher(cargoCode).matches();

        // Output results
        System.out.println("Train ID: " + trainId + " → " + (isTrainValid ? "VALID" : "INVALID"));
        System.out.println("Cargo Code: " + cargoCode + " → " + (isCargoValid ? "VALID" : "INVALID"));
    }
}