package Java_Basic_Practice.OOPS;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " even, We r Even");
        }
        else{
            System.out.println(num + " Odd.. Odd .. Odd");
        }
    }
}
