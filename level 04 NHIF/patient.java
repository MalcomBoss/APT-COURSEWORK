public class Patient {
    private String name;
    private String policyNumber;

    public Patient(String name, String policyNumber) {
        this.name = name;
        this.policyNumber = policyNumber;
    }

    public double calculateClaim(double amount) {
        double coPayment = amount * 0.10; // 10% co-payment rule 
        return amount - coPayment;
    }

    public String getName() { return name; }
    public String getPolicyNumber() { return policyNumber; }
}