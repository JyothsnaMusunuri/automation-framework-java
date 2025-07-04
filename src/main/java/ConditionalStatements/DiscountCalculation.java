package ConditionalStatements;

import java.util.Scanner;

//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.
// total - 10% discount
public class DiscountCalculation {
    public  static void main (String y[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity :");
        int quantity = sc.nextInt();
        int totalCost =quantity*100;
        if (totalCost>1000){
            System.out.println("Congratulations 10% discount is applicable and your bill is :" +(totalCost-0.1 *totalCost));
        }else {
            System.out.println("Your total bill amount is : "+  (totalCost));
        }
    }

}
