package ConditionalStatements;
// Write a program to check whether a person is eligible to vote or Not using switch statement
// above 18 = eligible for vote

import java.util.Scanner;

public class Eligible_To_Vote {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Citizen's Age");
        int Age = sc.nextInt();
        if (Age >=18){
            System.out.println("Citizen Is Eligible For Vote");
        }
        else {
            System.out.println("Citizen is Minor and not Eligible For Vote");
        }

    }
}
