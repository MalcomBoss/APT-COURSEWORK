#include <iostream>
using namespace std;

// Function to calculate fare based on set rules
double calculateFare(double distance) {
    double baseFare = 200.0; // KES [cite: 119]
    double costPerKm = 50.0; // KES [cite: 120]
    return baseFare + (distance * costPerKm);
}

int main() {
    double tripDistance;
    cout << "--- Nairobi Ride-Hailing (Procedural) ---" << endl;
    cout << "Enter trip distance in KM: ";
    cin >> tripDistance;

    double total = calculateFare(tripDistance);
    cout << "Total Fare: KES " << total << endl;

    return 0;
}