package SDET_Interview_Questions;

import java.util.Scanner;

public class Lab004_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine().toLowerCase();
        String clean = ""; //clean the word (keep only letters and numbers)

        for (int i = word.length() - 1; i >= 0; i--) {
            clean = clean + word.charAt(i);
            /*
             <---    <---      <---
            word.charAt(i) → “Give me one letter”
            clean + → “Add that letter to my box”
            clean = → “Put it back in the box”
            The box fills letter by letter, but backwards
            */
        }
        if (word.equals(clean)) {    //“Is the original word same as the backward word?”
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
