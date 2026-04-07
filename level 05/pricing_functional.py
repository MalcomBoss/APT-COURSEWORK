# Functional Approach using a Lambda function [cite: 130]
# Total = 200 (Base) + (Distance * 50)

calc_fare = lambda distance: 200 + (distance * 50)

def run_app():
    try:
        dist = float(input("Enter distance (KM): "))
        print(f"Functional Fare Result: KES {calc_fare(dist)}")
    except ValueError:
        print("Please enter a valid number.")

if __name__ == "__main__":
    run_app()