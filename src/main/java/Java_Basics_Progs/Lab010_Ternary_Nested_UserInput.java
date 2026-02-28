package Java_Basics_Progs;

import java.util.Scanner;

public class Lab010_Ternary_Nested_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Marks: ");
        int marks = sc.nextInt();

        String res = marks > 90 ? "A" : marks > 84 ? "B" : marks > 74 ? "C" : "D";
        System.out.println("Garde is : " + res);
    }
}
