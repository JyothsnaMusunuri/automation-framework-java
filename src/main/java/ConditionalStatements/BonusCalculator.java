package ConditionalStatements;

import java.util.Scanner;

//Calculate Bonus Based on Salary and Years of Experience.
//
//          :- take the salary and Year info from the User.
//
//Implement Bonus Calculation Logic:
//
//     Define the bonus structure based on salary and years of experience.
//
//           :- If years of experience is less than 1 year: No bonus.
//
//           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//
//           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//
//           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
public class BonusCalculator {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter years of expereince ");
        double expereince = sc.nextDouble();
        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();
        double bonus = 0;
        if (expereince < 1) {
             bonus = 0;
        } else if (expereince >= 1 && expereince <= 3) {
             bonus = salary * 0.05;
        } else if (expereince > 3 && expereince <= 6) {
             bonus = (salary * 0.01);
        } else if (expereince >= 6) {
             bonus = salary * 0.15;
        }
        System.out.println("Your bonus is" + bonus);
    }
}
