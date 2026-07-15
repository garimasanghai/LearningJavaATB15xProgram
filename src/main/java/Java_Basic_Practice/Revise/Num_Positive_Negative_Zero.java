package Java_Basic_Practice.Revise;

import java.util.Scanner;

public class Num_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " : Positive");
        }
        else if (num < 0) {
            System.out.println(num + " : Negative");
        }
        else{
            System.out.println(num + " : Zero");
        }
        sc.close();
    }
}
