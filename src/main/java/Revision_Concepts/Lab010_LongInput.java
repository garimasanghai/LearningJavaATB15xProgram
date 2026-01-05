package Revision_Concepts;

import java.util.Scanner;

public class Lab010_LongInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        for(;;) {
            System.out.println("Enter the word: ");
            String word = sc.nextLine().toLowerCase();
            String clean = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                clean = clean + word.charAt(i);
            }
            if (word.equals(clean)) {
                System.out.println("Palindrome");
                break;
            } else {
                System.out.println("Try again");
            }
        }
        sc.close();
    }
}
