package Java_Basic_Progs;

//Convert a double value into int using explicit type casting and print both values

import java.util.Scanner;

public class Test3_Explicit_Type_Casting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in decimal: ");
        double val = sc.nextDouble();
        int num = (int)val;
        System.out.println("Double value: " + val);
        System.out.println("Int value: " + num);

        sc.close();
    }
}
