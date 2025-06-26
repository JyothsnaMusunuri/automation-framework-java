package Loops;

import java.util.Scanner;

// 123456
//654321
public class Reverse_Number {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number which need to be reversed");
        int num = sc.nextInt();
        int reversedNum = 0;
        while (num!=0) {
            num =num  / 10;
           reversedNum = num % 10 + reversedNum * 10;

        }
        System.out.println(reversedNum);
    }
}
