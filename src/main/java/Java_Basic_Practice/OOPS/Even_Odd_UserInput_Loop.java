package Java_Basic_Practice.OOPS;

import java.util.Scanner;

public class Even_Odd_UserInput_Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        for(int i = 1; i <=num; i++){
            if(i%2 == 0){
                System.out.println(i + " Even ..");
            }else{
                System.out.println(i + " <-- Odd");
            }
        }
    }
}
