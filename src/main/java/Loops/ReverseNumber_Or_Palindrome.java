package Loops;

import java.util.Scanner;

// 123456
//654321
public class ReverseNumber_Or_Palindrome {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number which need to be reversed");
        int num = sc.nextInt();
        int reversedNum = 0;
        while (num != 0) {
            num = num / 10;
            int digit = num % 10;
            reversedNum = digit + reversedNum * 10;
        }
        System.out.println(reversedNum);
    }
}
