package ConditionalStatements;
//Check if a Character is a Vowel or Consonant.
// a, e , i , o ,u

import java.util.Scanner;

public class Vowel_Or_Consonent {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char inputChar = sc.next().charAt(0);
        char ch = Character.toLowerCase(inputChar);
        //basicCodeForConsonentAndVowel(inputChar);
        Vowel_Or_Consonent(ch);
    }

    private static void basicCodeForConsonentAndVowel(char inputChar) {
        if (inputChar == 'a') {
            System.out.println("a is a Vowel");
        } else if (inputChar == 'e') {
            System.out.println("e is a Vowel");
        } else if (inputChar == 'i') {
            System.out.println("i is a Vowel");
        } else if (inputChar == 'o') {
            System.out.println("o is a Vowel");
        } else if (inputChar == 'u') {
            System.out.println("u is a Vowel");
        } else {
            System.out.println("Entered alphabet is a Consonent");
        }
    }

    private static void Vowel_Or_Consonent(char ch) {
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println("Entered alphabet is a Consonant");
        }
    }
}


