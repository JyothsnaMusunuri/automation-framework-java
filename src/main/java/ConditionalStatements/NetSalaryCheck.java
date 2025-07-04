package ConditionalStatements;

import java.util.Scanner;

// Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,) Reserch from your side for this program.
//        ✅ Assumptions (Based on Common Practices):
//        Component	Description
//        HRA	20% of Basic Pay
//        DA	15% of Basic Pay
//        Tax Deduction	10% of Gross Salary
public class NetSalaryCheck {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Pay :");
        double basicPay = sc.nextDouble();
        double hra= 0.2 * basicPay;
        double da = 0.15 * basicPay;
        double grossSalary = basicPay+hra+da;
        double tax = 0.01 * grossSalary;
        double netSalary = grossSalary-tax;
        System.out.println("User's HRA is " + hra);
        System.out.println("User's DA is "+ da);
        System.out.println("User's Gross Salary is " +grossSalary);
        System.out.println("User's Tax is " + tax);
        System.out.println("User's Netsalary is "+ netSalary);

        


    }
}
