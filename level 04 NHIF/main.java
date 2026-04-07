import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- NHIF Claim Processor ---");
        
        System.out.print("Enter Patient Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Policy Number: ");
        String policy = input.nextLine();

        Patient member = new Patient(name, policy);

        System.out.print("Enter Total Hospital Bill: ");
        double bill = input.nextDouble();

        double result = member.calculateClaim(bill);

        System.out.println("\n--- Processing Completed ---");
        System.out.println("Member: " + member.getName());
        System.out.println("Policy: " + member.getPolicyNumber());
        System.out.println("Final NHIF Payout: KES " + result);
    }
}