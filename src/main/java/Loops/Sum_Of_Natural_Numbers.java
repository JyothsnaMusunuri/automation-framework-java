package Loops;
///Sum of Natural Numbers (for loop)

import java.util.Scanner;

public class Sum_Of_Natural_Numbers {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural Numbers");
        int b = sc.nextInt();
        int  sum = 0;
        for (int i = b; i >= 1; i--) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
