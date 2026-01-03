package Revision_Concepts;

import java.util.Scanner;

public class Lab010_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("Enter the word: ");
            String word = sc.nextLine().toLowerCase();

            String cleanWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                cleanWord = cleanWord + word.charAt(i);
            }

            if (word.equals(cleanWord)) {
                System.out.println("Palindrome");
                break;
            } else {
                System.out.println("Try another word");
            }
        }
        sc.close();
    }
}
