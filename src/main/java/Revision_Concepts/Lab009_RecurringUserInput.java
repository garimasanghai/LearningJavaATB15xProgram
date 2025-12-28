package Revision_Concepts;

import java.util.Scanner;

public class Lab009_RecurringUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (; ; ) // infinite loop: Keep asking the user again and again, until input is correct
        {
            System.out.println("Enter the number :");
            int number = scan.nextInt();

            if (number >= 70 && number <= 90) {
                System.out.println("Proceed Further");
                break;
            } else {
                System.out.println("Enter Number in between 70 - 90");
            }
        }
        scan.close();
    }
}
