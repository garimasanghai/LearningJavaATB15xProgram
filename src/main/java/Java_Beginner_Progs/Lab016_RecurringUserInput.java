package Java_Beginner_Progs;

import java.util.Scanner;

public class Lab016_RecurringUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (;;) {   // infinite loop: Keep asking the user again and again, until input is correct

            System.out.println("Enter the Subject :");
            String subject = scan.next().toLowerCase();

            if (subject.equals("maths") ||
                    subject.equals("english") ||
                    subject.equals("science") ||
                    subject.equals("history")) {

                System.out.println("Enter Marks :");
                int marks = scan.nextInt();

                // Pass / Fail condition check
                if (marks >= 30) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Fail");
                }

                // Grade check
                if (marks >= 90) {
                    System.out.println("Grade is : A");
                }
                else if (marks >= 70) {
                    System.out.println("Grade is : B");
                }
                else {
                    System.out.println("Grade is : C");
                }

                break;   // exit loop after valid input

            } else {
                System.out.println("Enter Valid Subject");
            }
        }
        scan.close();
    }
}
