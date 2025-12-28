package Revision_Concepts;

import java.util.Scanner;

public class Lab009_RecurringUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Enter the number :");
            int number = scan.nextInt();

            if (number >= 70 && number <= 90) {
                System.out.println("Proceed Further");
                break;
            } else {
                System.out.println("Enter Number in between 70 to 90");
            }
        }
        scan.close();
    }
}
