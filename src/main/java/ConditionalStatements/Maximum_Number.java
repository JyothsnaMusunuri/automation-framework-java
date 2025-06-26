package ConditionalStatements;
//Find the Maximum of Two Numbers

import java.util.Scanner;

public class Maximum_Number {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        System.out.println("Enter Second Number");
        int B = sc.nextInt();
        int C = sc.nextInt();
        maximumOfTwoNumbers(B, C);
    }

    private static void maximumOfTwoNumbers(int B, int C) {
        if (B > C) {
            System.out.println(B+ "Is Maximum number");
        } else if (C > B) {
            System.out.println(C + "Is Maximum Number");
        } else {
            System.out.println("Both B and C are equal");
        }
    }
}

