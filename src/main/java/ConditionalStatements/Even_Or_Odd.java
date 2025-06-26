package ConditionalStatements;

import java.util.Scanner;

//Printing Even Numbers (while loop)
public class Even_Or_Odd {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 ==0){
            System.out.println("Entered number is Even Number");
        }
        else{
            System.out.println("Entered number is odd");
        }

    }
}
