package Loops;
// Multiplication table of a number
// 3 * 1 = 3
// 3* 2 = 6

import java.util.Scanner;

public class Multiplication_Of_Number {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number which you want to do multiplication");
        int b = sc.nextInt();

        for (int i = 1 ;i<=10;i++){

            System.out.println(b +"x"+ i +"="+ (b * i) );
        }

    }

}
