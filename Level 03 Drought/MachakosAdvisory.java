import java.util.Scanner;

/**
 * APT1030-A: Level 3 Control Flow
 * Machakos County Drought Advisory Logic
 */
public class MachakosAdvisory {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        try {
            System.out.print("Rainfall amount (mm): ");
            double rain = console.nextDouble();

            System.out.print("Temperature (°C): ");
            double temp = console.nextDouble();

            System.out.println("--- System Analysis ---");

            if (rain < 200) {
                System.out.println("Result: Irrigation Required");
            } 
            else if (temp > 30) {
                System.out.println("Result: Monitor Soil");
            } 
            else {
                System.out.println("Result: Normal Conditions");
            }

        } catch (Exception e) {
            System.out.println("Error: Please enter numbers only.");
        } finally {
            console.close();
        }
    }
}