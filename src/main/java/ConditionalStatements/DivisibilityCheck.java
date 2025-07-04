package ConditionalStatements;
//divisible by both 5 and 11:

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if (num%5==0 && num%11 ==0){
            System.out.println("Entered num is divisible by both 5 & 11");
        }else {
            System.out.println("Entered number is not divisible by 5 & 11");
        }
    }
}
