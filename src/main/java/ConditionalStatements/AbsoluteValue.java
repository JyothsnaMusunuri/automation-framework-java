package ConditionalStatements;
//Write a program to print absolute vlaue of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1  1 * -
//INPUT: -1        OUTPUT: 1
import java.util.Scanner;

public class AbsoluteValue {
    public static void main (String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter then number");
        int num = sc.nextInt();
        if (num<0){
            System.out.println("Absolute Value is: "+ (-1*num) );
        }else {
            System.out.println("Absolute Value is :" +num );
        }
    }
}
