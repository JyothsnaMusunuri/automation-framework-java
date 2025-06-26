package Loops;
//Write a Program to Find Factorial of a Number in Java.
//Input: 5
//Output: 120

import java.util.Scanner;

public class Factorial_Of_Number {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i=n; i>=1;i-- ){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
