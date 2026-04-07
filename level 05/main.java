import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance for OOP calculation: ");
        double dist = sc.nextDouble();

        RideTrip myTrip = new RideTrip(dist);
        System.out.println("OOP Total Fare: KES " + myTrip.getTotalFare());
    }
}