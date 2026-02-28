package Java_Basics_Progs;

import java.util.Scanner;

public class Lab018_Function_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter then nums: ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        int result = calculate(a,b);
        System.out.println(result);
        justPrint();
    }

    public static int calculate(int a, int b){
        return a*b;
    }

    public static void justPrint(){
        System.out.println("I am simply testing");
    }
}

