package ConditionalStatements;
//Check if a Number is Prime

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isprime = true;
        if (num <= 1){
            isprime = false;
        }else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime==true){
            System.out.println("Entered number is prime");
        }
        else {
            System.out.println("Entered number is not prime");
        }

    }
}
