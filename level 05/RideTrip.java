import java.util.Scanner;

public class RideTrip {
    private double distance;
    private static final double BASE_FARE = 200.0;
    private static final double RATE_PER_KM = 50.0;

    public RideTrip(double distance) {
        this.distance = distance;
    }

    public double getTotalFare() {
        return BASE_FARE + (this.distance * RATE_PER_KM);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Nairobi Ride-Hailing (OOP Approach) ---");
        System.out.print("Enter trip distance in KM: ");
        
        try {
            double dist = input.nextDouble();
            RideTrip myTrip = new RideTrip(dist);
            
            System.out.println("-------------------------------------------");
            System.out.println("Total Fare: KES " + myTrip.getTotalFare());
            System.out.println("-------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid numerical distance.");
        } finally {
            input.close();
        }
    }
}