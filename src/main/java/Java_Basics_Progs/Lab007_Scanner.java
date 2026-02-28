package Java_Basics_Progs;

import java.util.Scanner;

public class Lab007_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Subject:");
        String sub = scan.next().toLowerCase();

        if (sub.equals("maths") || sub.equals("english") || sub.equals("science") || sub.equals("sst") || sub.equals("env")) {

            System.out.println("Enter Marks:");
            int marks = scan.nextInt();

            String result = marks >= 30 ? "Pass" : "Fail";
            System.out.println(result);

            char score = marks > 90 ? 'A' : (marks > 70 ? 'B' : 'C');
            System.out.println(score);

        } else {
            System.out.println("Invalid subject entered");
        }
        scan.close();
    }
}
