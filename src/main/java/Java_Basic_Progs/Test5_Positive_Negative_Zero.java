package Java_Basic_Progs;

import java.util.Scanner;

public class Test5_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();

        String res = num >= 1 ? "Positive" : num == 0 ? "Zero" : "Negative";
        System.out.println(res);
    }
}
