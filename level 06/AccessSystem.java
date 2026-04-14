import java.util.Scanner;

public class AccessSystem {
    
    public static void checkAccess(String role) {
        String patientData = "Record #456: Recovery Progress 85%";

        try {
            System.out.println("\nChecking credentials for: " + role);
            
            if (!role.equalsIgnoreCase("Doctor")) {
                throw new Exception("Access Denied: Insufficient Privileges.");
            }
            
            System.out.println("SUCCESS: " + patientData);
            
        } catch (Exception e) {
            System.err.println("CRITICAL ERROR: " + e.getMessage());
        } finally {
            System.out.println("System: Security session closed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Hospital Access Portal ---");
        System.out.print("Enter Role: ");
        String userRole = scanner.nextLine();
        
        checkAccess(userRole);
        scanner.close();
    }
}   