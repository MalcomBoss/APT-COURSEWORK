import java.util.Scanner;

// Level 4: Abstraction and Modularity
// Context: NHIF Claims Processing
class Patient {
    private String name;
    private String policyNumber;
    private double totalBill;

    // Constructor to initialize patient data
    public Patient(String name, String policyNumber, double totalBill) {
        this.name = name;
        this.policyNumber = policyNumber;
        this.totalBill = totalBill;
    }

    //CORE LOGIC: Abstraction of the claim calculation
    public double calculateClaim() {
        // NHIF Rule: 10% co-payment is deducted from the total bill
        double coPayment = this.totalBill * 0.10;
        return this.totalBill - coPayment;
    }

    // Method to display the final result
    public void displayReport() {
        System.out.println("\n--- Processing Completed ---");
        System.out.println("Member Name: " + this.name);
        System.out.println("Policy Number: " + this.policyNumber);
        System.out.println("Total Hospital Bill: KES " + this.totalBill);
        System.out.println("Final NHIF Payout (after 10% deduction): KES " + calculateClaim());
        System.out.println("----------------------------");
    }
}

public class NHIF_OOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- USIU-A NHIF Claim Processor ---");
        
        System.out.print("Enter Patient Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Policy Number: ");
        String policy = input.nextLine();
        
        System.out.print("Enter Total Hospital Bill: ");
        double bill = input.nextDouble();

        // Creating the Object (OOP Approach)
        Patient patient1 = new Patient(name, policy, bill);
        
        // Calling the abstracted method
        patient1.displayReport();
        
        input.close();
    }
}