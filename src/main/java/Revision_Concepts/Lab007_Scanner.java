package Revision_Concepts;

import java.util.Scanner;

public class Lab007_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Subject : ");
        String Subject = scan.next();

        scan.nextLine();

        System.out.println("Enter Marks : ");
        int Marks = scan.nextInt();

//        System.out.println("grade : ");
//        String grade = scan.next();

        String result = Marks >= 30 ? "Pass" : "Fail";
        System.out.println(result);

        char Score = Marks > 90 ? 'A' : (Marks < 90 && Marks > 70) ? 'B' : 'C';
        System.out.println(Score);

        scan.close();
    }
}
