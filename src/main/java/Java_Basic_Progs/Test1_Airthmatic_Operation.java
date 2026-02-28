package Java_Basic_Progs;

//Take two integer nums & print their sum, diff, mul, div, and remainder.

import java.util.Scanner;

public class Test1_Airthmatic_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int addition = add(num1,num2);
        System.out.println("add: " + addition);
        int subtract = sub(num1, num2);
        System.out.println("sub: " + subtract);
        int multiply = mul(num1, num2);
        System.out.println("mul: " + multiply);
        int division = div(num1, num2);
        System.out.println("div: " + division);
        int modulus = mod(num1, num2);
        System.out.println("mod: " + modulus);

        sc.close();

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1-num2;
    }

    public static int mul(int num1, int num2){
        return num1 * num2;
    }

    public static int div(int num1, int num2){
        return num1/num2;
    }

    public static int mod(int num1, int num2){
        return num1 % num2;
    }
}
