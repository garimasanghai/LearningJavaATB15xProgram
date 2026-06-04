package Java_Basic_Practice;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int resultMax = Math.max(num1,num2);
        int resultMin = Math.min(num1, num2);
        System.out.println(resultMax + " Max");
        System.out.println(resultMin + " Min");
    }
}
