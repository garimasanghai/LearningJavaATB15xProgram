package SDET_Interview_Questions;

import java.util.Scanner;

public class Lab003_Tables {
    public static void main(String[] args) {
        int num = 2;
        for(int i = 0; i <= 10; i ++){
            System.out.println(num + "x" + i + "=" + num*i);
        }
        System.out.println("Initiating User Input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 0; i <= 10; i++)
            System.out.println(n + "x" + i + "=" + n*i);
    }
}
