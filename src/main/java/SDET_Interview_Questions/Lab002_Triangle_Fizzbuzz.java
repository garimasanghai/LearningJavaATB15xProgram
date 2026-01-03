package SDET_Interview_Questions;

import java.util.Scanner;

public class Lab002_Triangle_Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 side: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral");
        }
        else if(side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }
        sc.nextLine();

        System.out.println("***********");

        for(int i = 1; i<=100; i++) {

            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
