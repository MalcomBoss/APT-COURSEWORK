import java.util.Scanner;

public class LoginSystem {
    public static void maiin(String[] args) {
        
        final String VALID_USER = "adminKE";
        final String VALID_PASS = "254Secure";

        Scanner input = new Scanner(System.in);

        System.out.println("--- eCitizen Login Validation System ---");
        System.out.print("Username: ");
        string enteredUser = input.nextLine()

        System.out.print("Password: ");
        String enteredPass = input.nextLine()

       
        if (enteredUser.equals(VALID_USER) && enteredPass.equals(VALID_PASS)) {
            System.out.println("Access Granted"); // 
        } else {
            System.out.println("Invalid Credentials"); // [cite: 19]
        }
        
        input.close();
    }
