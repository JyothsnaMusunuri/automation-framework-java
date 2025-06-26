package ConditionalStatements;

import java.util.Scanner;

public class CharacterIsAlphabet {
    public static void main(String b[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        withoutAsciiRange(ch);
    }

    private static void withoutAsciiRange(char ch) {
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("Entered Character is an Alphabet");
        } else {
            System.out.println("Entered Character is not an Alphabet");
        }

    }

}
