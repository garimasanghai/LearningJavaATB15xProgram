package Java_Basic_Practice.Revise;

import java.util.Scanner;

public class Recurring_Input {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        for(; ;){ // infinite loop: Keep asking the user again and again, until input is correct
            System.out.println("Enter Sub: ");
            String sub = sc.next().toLowerCase();

            if(sub.equals("maths") || sub.equals("english") || sub.equals("sst") || sub.equals("env")){
                System.out.println("Enter marks: ");
                int marks = sc.nextInt();

                if(marks >= 36){
                    System.out.println("Pass");
                }
                else{
                    System.out.println("Fail");
                }

                if(marks > 79 && marks <= 100){
                    System.out.println("Grade A");
                } else if (marks >= 70) {
                    System.out.println("Grade B");
                } else if (marks >= 60) {
                    System.out.println("Grade C");
                }
                else{
                    System.out.println("Work on your Grades");
                }
                break;
            }
        }
        sc.close();
    }
}
