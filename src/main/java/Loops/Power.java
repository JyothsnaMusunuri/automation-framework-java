package Loops;
// Write a program to find the value of one number raised to the power of another
// 2 ^ 5 2*2*2*

import java.util.Scanner;

public class Power {
    public static void main (String a []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value");
        int base = sc.nextInt();
        System.out.println("Enter power value");
        int power = sc.nextInt();
        int result= 1  ;
        for (int i=1;i<=power;i++){

             result  = result*(base)  ;
        }
        System.out.println(result);

    }


}
