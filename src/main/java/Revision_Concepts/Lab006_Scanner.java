package Revision_Concepts;

import java.util.Scanner;

public class Lab006_Scanner {
    public static void main(String[] args) {

        // Marks > 50 it will pass || otherwise fail
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mark: ");
        double mark = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter the exam: ");
        // System.out.println("Enter the exam: ");
        String exam = scan.nextLine();

        String result = mark >= 50 ? "Pass" : "Fail";
        System.out.println(result);

        // if mark >= 70 then A ; mark < 70 && > 50 then B ; <= 50 C

        char grade = mark >= 70 ? 'A' : (mark < 70 && mark > 50) ? 'B': 'C';
        System.out.println(grade);

        scan.close();
    }
}
