package ConditionalStatements;
//Find the Largest of Three Numbers.

import java.util.Scanner;

public class MaximumOfThree {
    public static void main (String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        if (a>=b && a>=c){
            System.out.println(a + " is Largest Number");
        } else if (c>=b && c>=a) {
            System.out.println(c + " is largest number");
        } else  {
            System.out.println(b + " is the Largerest Number");
        }

    }
}
