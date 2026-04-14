def check_access(role):
    patient_record = "Patient ID: 10293 | Status: Stable | Room: 402"
    
    try:
        print(f"\nVerifying credentials for role: {role}")
        
        if role.lower() != "doctor":
            raise PermissionError("Access Denied: Only Doctors can view records.")
        
        print(f"GRANTED: {patient_record}")
        
    except PermissionError as e:
        print(f"SECURITY ALERT: {e}")
    finally:
        print("Log: Security session ended.")

print("--- USIU-A Hospital Information System ---")
user_input = input("Enter your role: ")
check_access(user_input)