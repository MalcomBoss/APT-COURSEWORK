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
}