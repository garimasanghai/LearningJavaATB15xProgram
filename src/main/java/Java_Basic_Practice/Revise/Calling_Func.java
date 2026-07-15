package Java_Basic_Practice.Revise;

import java.util.Scanner;

public class Calling_Func {

    public static int sum(int a , int b){
        int c = a + b;
        return c;
    }
    public static int sub(int d, int e) {
            if (d > e) {
                int f = d - e;
                return f;
            } else {
                System.out.println("Give valid input . .");
                return 0;
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = sum(a, b);
        System.out.println("Sum : " + result);

        int d = sc.nextInt();
        int e = sc.nextInt();
        int result1 = sub(d,e);
        System.out.println("Sub : " + result1);
    }
}
