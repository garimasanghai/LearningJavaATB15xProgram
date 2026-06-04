package Java_Basic_Practice;

import java.util.Scanner;

public class Sub_Marks_Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String sub = sc.next().toLowerCase();

        if(sub.equals("english") || sub.equals("maths") || sub.equals("env") || sub.equals("sst")){
            System.out.println("Enter marks: ");
            int marks = sc.nextInt();

            String result = marks >= 30 ? "Pass" : "Fail";
            System.out.println(result);

            char score = marks >= 90 ? 'A' : (marks >= 80 ? 'B' : 'C');
            System.out.println(score);
        }
        else{
            System.out.println("Print valid subject name");
        }
        sc.close();
    }
}
