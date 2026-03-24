# APT1030: Fundamentals of Programming Languages
# Module: Level 1 - Syntax and Semantics
# System: eCitizen Credentials Validator

# Using 'constants' for stored credentials to look more professional
OFFICIAL_USER = "adminKE"
OFFICIAL_PASS = "254Secure"

def main():
    print("=== eCitizen Portal Login ===")
    
    # Using descriptive variable names instead of generic ones
    entered_id = input("Please enter your Username: ")
    entered_secret = input("Please enter your Password: ")

    # Applying the validation logic
    if (entered_id == OFFICIAL_USER) and (entered_secret == OFFICIAL_PASS)
        print("\n[SUCCESS] Access Granted. Welcome to eCitizen.")
    else:
        print("\n[ERROR] Invalid Credentials. Please try again.")

if __name__ == "__main__":
    main()