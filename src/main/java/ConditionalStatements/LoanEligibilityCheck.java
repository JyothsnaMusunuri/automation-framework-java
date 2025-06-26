package ConditionalStatements;
///check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
//
//    * Take the below User info and store it into the variables:
//
//              Age (integer)
//
//              Salary (double or float)
//
//              Credit Score (integer)
//
//
//
//    Age Validation:
//
//              :- Check if the age is a positive integer.
//
//              :- Ensure the age is at least 18 years old.
//
//              :- Max age can be 80.
//
//
//
//    Salary Validation:
//
//             :- Check if the salary is a positive number.
//
//             :- Define a minimum salary threshold (e.g., 30,000).
//
//    Credit Score Validation:
//
//             :- Check if the credit score is a positive integer.
//
//             :- Define a minimum credit score threshold (e.g., 650).
//
//             :- Max credit score threshold (e.g., 850).

import java.util.Scanner;

public class LoanEligibilityCheck {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User's Age");
        int age = sc.nextInt();
        System.out.println("Enter User's Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter User's CreditScore");
        int creditScore = sc.nextInt();
        conditionInsideCondition(age,salary,creditScore);
    }


    private static void conditionInsideCondition(int age,double salary,int creditScore) {
        if (age >= 0 && age >= 18 && age <= 80) {
            if (salary >= 1 && salary >= 30000) {
                if (creditScore >= 0 && creditScore >= 650 || creditScore >= 850) {

                }
                System.out.println("User is Eligible for Loan");
            }
        } else {
            System.out.println("User is not Eligible for Loan");
        }
    }
}

