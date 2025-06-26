package ConditionalStatements;
//Write a program that calculates and displays the letter grade for a given
// numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

import java.util.Scanner;
import java.util.SortedMap;

public class GradeCalculator {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks between 1 to 100");
        int num = sc.nextInt();
        usingIf(num);

    }

    private static void usingIf(int num) {
        if (num > 100) {
            System.out.println("Entered number not found");
        } else if (num >= 90 && num <= 100) {
            System.out.println("A");
        } else if (num >= 80 && num <= 89) {
            System.out.println("B");
        } else if (num >= 70 && num <= 79) {
            System.out.println("C");
        } else if (num >= 60 && num <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
