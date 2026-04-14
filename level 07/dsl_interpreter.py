# Level 7: Mini DSL for Mobile Money Rules 

def run_transaction_rule(command_string, account_balance):
    # 1. Parsing: Breaking the string into a list [cite: 168]
    tokens = command_string.split()
    
    # 2. Extraction 
    try:
        # Corrected Indices to match the sentence structure
        amount = float(tokens[1])      # "2500"
        sender = tokens[3]             # "USER_A"
        receiver = tokens[5]           # "USER_B"
        min_balance = float(tokens[9]) # "500" (This was the error!)
        
        print(f"Processing: {sender} -> {receiver} (KES {amount})")

        # 3. Validation 
        if account_balance > min_balance:
            print("--- TRANSACTION SUCCESSFUL ---")
            print(f"New Balance: KES {account_balance - amount}")
            print(f"New Balance: KES {account_balance - amount}")
        else:
            print("--- TRANSACTION REJECTED ---")
            print("Reason: Balance is below the required rule threshold.")
            
    except (IndexError, ValueError):
        print("Error: Command syntax is incorrect.")

# Example Syntax: TRANSFER 5000 FROM A TO B IF BALANCE > 1000
test_command = "TRANSFER 2500 FROM USER_A TO USER_B IF BALANCE > 500"
run_transaction_rule(test_command, 3000)