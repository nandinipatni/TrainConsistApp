import java.util.*;

public class UseCase15TrainConsistMgmt {

    // 🔥 CUSTOM RUNTIME EXCEPTION
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie class
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // assign cargo with validation
        void assignCargo(String cargo) {
            try {
                // ❗ Rule: Rectangular cannot carry Petroleum
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment: Rectangular bogie cannot carry Petroleum");
                }

                this.cargo = cargo;
                System.out.println("Assigned " + cargo + " to " + shape + " bogie");

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Validation complete for " + shape + " bogie\n");
            }
        }

        @Override
        public String toString() {
            return shape + " → " + cargo;
        }
    }

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // SAFE
        b1.assignCargo("Petroleum");

        // ❌ UNSAFE (will throw but handled)
        b2.assignCargo("Petroleum");

        // SAFE again (program continues)
        b2.assignCargo("Coal");

        System.out.println("\nFinal Bogie Status:");
        System.out.println(b1);
        System.out.println(b2);
    }
}