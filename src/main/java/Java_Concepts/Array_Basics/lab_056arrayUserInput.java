package Java_Concepts.Array_Basics;

import java.util.Scanner;

public class lab_056arrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array from User ");
        int size = sc.nextInt();
        int [] num = new int[size]; //Creating an Array

        // to get the input of numbers
        for(int i = 0; i <size; i ++){
            System.out.println("enter the number");
            num[i] = sc.nextInt();
        }

        //Print the number entered by the user
        // for(int i = 0; i <num.length; i++)
        for(int i = 0; i <size; i++){
            System.out.println("The numbers are: " + num[i]);
        }


    }
}
