package ConditionalStatements;

import java.util.Scanner;

//Find if a Person is Senior Citizen Based on Age.
//  take the age input from the user.
//Implement Age Category Logic:
//Define the criteria for different age categories:
//Child: Age 0 to 12
//Teenager: Age 13 to 19
//Adult: Age 20 to 64
//Senior Citizen: Age 65 and older
public class AgeCategoryChecker {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User's Age");
        int age = sc.nextInt();
        if (age < 0){
            System.out.println("Invalid age.");
        } else if (age >= 0 && age <= 12) {
            System.out.println("You are a child.");
        } else if (age >=13 && age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are an Adult.");
        } else if (age >= 65) {
            System.out.println("You are a Senior Citizen.");
        }
        sc.close();
    }
}
