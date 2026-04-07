# Level 7: Mini DSL for Mobile Money Rules 

def run_transaction_rule(command_string, account_balance):
    # 1. Parsing: Breaking the string into a list [cite: 168]
    tokens = command_string.split()
    
    # 2. Extraction 
    try:
        amount = float(tokens[1])    # Extracting Amount 
        sender = tokens[3]           # Extracting Sender 
        receiver = tokens[5]         # Extracting Receiver 
        min_balance = float(tokens[8])
        
        print(f"Processing: {sender} -> {receiver} (KES {amount})")
        
        # 3. Validation 
        if account_balance > min_balance:
            print("--- TRANSACTION SUCCESSFUL ---") [cite: 177]
            print(f"New Balance: KES {account_balance - amount}")
        else:
            print("--- TRANSACTION REJECTED ---")
            print("Reason: Balance is below the required rule threshold.")
            
    except (IndexError, ValueError):
        print("Error: Command syntax is incorrect.")

# Example Syntax: TRANSFER 5000 FROM A TO B IF BALANCE > 1000
test_command = "TRANSFER 2500 FROM USER_A TO USER_B IF BALANCE > 500"
run_transaction_rule(test_command, 3000)