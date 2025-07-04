package ConditionalStatements;
// ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
//       Steps to Write the Program
//1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//2️⃣ Take user input for the amount they want to withdraw.
//3️⃣ Check withdrawal conditions:
//The amount should be greater than zero.
//The amount should be a multiple of 100 (common ATM rule).
//The amount should not exceed the account balance.
//4️⃣ Deduct the amount from the balance if conditions are met.
//5️⃣ Display the updated balance or an error message if the withdrawal fails.

import java.util.Scanner;

public class AmountWithdrawal {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount you want to Withdraw !!");
        int amount = sc.nextInt();
        double balance = 602389.899;
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter an amount greater than zero");
        } else if (amount%100!=0) {
            System.out.println("Amount must be multiple of 100.");

        } else if (amount > balance) {
            System.out.println("You have insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        }
    }
}
