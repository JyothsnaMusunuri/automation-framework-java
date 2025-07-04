package ConditionalStatements;
//Take cost price and selling price, and print if it’s a profit, loss, or neither.

import java.util.Scanner;

public class ProfiltLossCalculator {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price of a Product");
        double costPrice = sc.nextDouble();
        System.out.println("Enter Selling price of the Product");
        double sellingPrice = sc.nextDouble();
        if (sellingPrice > costPrice) {
            System.out.println("ShopKeeper Got Profit");
        } else if (sellingPrice == costPrice) {
            System.out.println("ShopKeeper neither got Profit Nor Loss");
        } else {
            System.out.println("ShopKeeper got loss");
        }
    }
}
