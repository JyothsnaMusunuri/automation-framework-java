package ConditionalStatements;
//Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
//           :- take the Site URL input from the user
//Example Scenarios
//Input: example.com
//Output: The website type is: Commercial website
//Input: example.org
//Output: The website type is: Non-profit organization
//Input: example.edu
//Output: The website type is: Educational institution
//Input: example.gov
//Output: The website type is: Government website
//Input: example.net
//Output: The website type is: Network-related website
//Input: example.info
//Output: The website type is: Informational website
//Input: example.xyz
//Output: The website type is: Unknown or other types of websites

import java.util.Scanner;

public class WebsiteTypeChecker {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Website Based on Domain");
        String website = sc.next();
        if (website.endsWith(".com")) {
            System.out.println("The website type is: Commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (website.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (website.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (website.endsWith(".net")) {
            System.out.println(" The website type is: Network-related website");
        } else if (website.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        } else if (website.endsWith(".xyz")) {
            System.out.println("The website type is: Unknown or other types of websites");
        } else {
            System.out.println("Not an valid org");
        }
    }
}
