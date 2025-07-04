package ConditionalStatements;
///Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class RectangleCheck {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        int length = sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth = sc.nextInt();
        if (length==breadth){
            System.out.println("Entered Length and Breadth forms a Square");
        }else {
            System.out.println("Entered Length and Breadth does not forms a square but forms a Rectangle ");
        }
    }
}
