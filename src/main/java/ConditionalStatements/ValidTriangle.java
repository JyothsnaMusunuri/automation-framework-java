package ConditionalStatements;

import java.util.Scanner;

// Check if a Triangle is Valid Based on Three Sides
public class ValidTriangle {
    public static void main (String x[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first side value");
        int a= sc.nextInt();
        System.out.println("Enter Second side value");
        int b = sc.nextInt();
        System.out.println("Enter Third side value");
        int c = sc.nextInt();
        if (a+b>c){
            System.out.println("Entered sides form a valid triangle");
        }else if(b+c>a){
            System.out.println("Entered sides form a valid triangle");
        }else if (c+a>b){
            System.out.println("Entered sides form a valid triangle");
        }else {
            System.out.println("It is not a valid triangle");
        }
    }
}
