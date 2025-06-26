package ConditionalStatements;

import java.util.Scanner;

//Check if a Number is Positive or Negative.
public class Positive_Or_Negative {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("Entered Number Is Positive Number");
        }
        else {
            System.out.println("Entered Number Is Negative Number");
        }
    }
}
