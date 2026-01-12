package Java_Test;

import java.util.Scanner;

public class Test2_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + ":Even Number");
        }
        else{
            System.out.println(num + ":Odd Number");
        }
        sc.close();
    }
}
