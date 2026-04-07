import java.util.Scanner;

public class AccessSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter System Role: ");
        String role = input.nextLine();

        try {
            validateRole(role);
        } catch (Exception e) {
            // This catches the error and prints a message instead of crashing
            System.out.println("System Error: " + e.getMessage());
        }
    }

    public static void validateRole(String role) throws Exception {
        if (!role.equals("Doctor")) {
            throw new Exception("Security Alert: Unauthorized Role Detected!");
        }
        System.out.println("Access Authorized.");
    }
}