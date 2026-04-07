# Level 4 Refactoring Task: Procedural Approach

def compute_claim(amount):
    """Calculates claim by deducting 10% co-pay"""
    return amount * 0.90

patient_name = input("Enter Patient Name: ")
policy_id = input("Enter Policy Number: ")
bill_amount = float(input("Enter Bill: "))

approved_amount = compute_claim(bill_amount)

print(f"\nPatient: {patient_name}")
print(f"Policy: {policy_id}")
print(f"NHIF Coverage: KES {approved_amount}")