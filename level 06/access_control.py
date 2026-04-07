def check_access(role):
    # Standard rule: Only Doctors get in
    if role != "Doctor":
        raise PermissionError("Access Denied: Only Doctors can view these records.")
    else:
        print("Access Granted. Welcome, Doctor.")

# Test the logic
user_role = input("Enter your role: ")
try:
    check_access(user_role)
except PermissionError as e:
    print(e)