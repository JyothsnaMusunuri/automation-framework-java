package ConditionalStatements;
//Find if a Person Can Travel Based on Visa Status and Age.
//     take the input from the user for
//            Age (integer).
//            Visa Status (String or boolean).
//     Check Eligibility:
// :- If age is 18 or older and visa status is valid, the person can travel.
//Otherwise, the person cannot travel.
//        Validation Criteria
// Age: - Must be a non-negative integer.
//:- Should be greater than or equal to 18 to be eligible to travel.
//        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
//  :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.

import java.util.Scanner;

public class TravelEligibility {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User's Age");
        int age = sc.nextInt();
        System.out.println("Enter user's Visa Status");
        boolean visaStatus = sc.nextBoolean();
        if (age < 0) {
            System.out.println("Invalid age. Age must be a non-negative number");
            return;
        }
        if (age >= 18 && visaStatus == true) {
            System.out.println("User is eligible to travel;");
        } else if (age >= 18 && visaStatus == false) {
            System.out.println("User meets age criteria but visa is not valid. Cannot travel");
        } else {
            System.out.println("User is not eligible to travel (underage).");
        }
    }
}
