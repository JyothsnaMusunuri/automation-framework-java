package ConditionalStatements;
//Electricity Bill Calculation (Based on Units Consumed)
//  take the input from the user of Units.
//
//    Implement Rate Structure:
//
//    Define the rate structure for calculating the bill based on the number of units consumed.
//
//            :-  First 100 units: 0.50Rs per unit
//
//            :-  Next 100 units (101-200): 0.75Rs per unit
//
//            :- Next 100 units (201-300): 1.20Rs per unit
//
//            :- Above 300 units: 1.50Rs per unit

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Units");
        double units = sc.nextDouble();
        double bill;
        if (units <= 0) {
            System.out.println("Units should not be negative ");
        } else if (units <= 100) {
            bill = units * 0.5;
            System.out.println(bill);
        } else if (units <= 200) {
            bill = ((units - 100) * 0.75) + (0.5 * 100);
            System.out.println(bill);
        } else if (units <= 300) {
            bill = ((units - 200) * 1.20) + 100 * 0.75 + 100 * 0.50;
            System.out.println(bill);
        } else if (units > 300) {
            bill = ((units - 300) * 1.50) + (200 * 1.20) + (100 * 0.75) + 100 * 0.50;
            System.out.println(bill);
        }
    }
}


