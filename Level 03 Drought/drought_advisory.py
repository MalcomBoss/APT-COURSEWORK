# APT1030-A: Level 3 - Control Flow Task
# Focus: Machakos County Drought Logic

def run_advisory_check():
    print("--- Machakos County Agricultural Support Tool ---")
    
    try:
        # Getting user inputs
        mm_rainfall = float(input("Current rainfall reading (mm): "))
        current_temp = float(input("Current temperature reading (Celsius): "))

        print("-" * 30)
        
        if mm_rainfall < 200:
            status = "Irrigation Required"
            
        elif mm_rainfall >= 200 and current_temp > 30:
            status = "Monitor Soil"
            
        else:
            status = "Normal Conditions"

        print(f"SYSTEM ANALYSIS: {status}")

    except ValueError:
        print("Input Error: Please make sure to enter numbers only.")

if __name__ == "__main__":
    run_advisory_check()