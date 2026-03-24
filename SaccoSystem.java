public class SaccoSystem {
    public static void main(String[] args) {
        // Arrays for 5 members
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int[] balances = {5000, 12000, 7500, 20000, 3200};

        System.out.println("--- SACCO Member Savings List ---");

        // Loop through the arrays
        for (int i = 0; i < names.length; i++) {
            System.out.println("Member: " + names[i] + " | Balance: KES " + balances[i]);
        }
    }
}