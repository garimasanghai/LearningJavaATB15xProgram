package Java_Test;

import java.util.Scanner;

public class Test4_Maximum_Of_Two_Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res = Math.max(num1, num2);
        System.out.println("Max num:" + res);
    }
}
