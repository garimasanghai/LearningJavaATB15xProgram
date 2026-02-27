package Array_Basics;

import java.util.Scanner;

public class lab_066arrayRectangleScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows");
        int size = sc.nextInt();
        int [] rectangleSize = new int[size];//creating an array

        for(int i = 0; i < rectangleSize.length+1; i++){
            for(int j = 0; j < rectangleSize.length; j++) { // will always give u columns
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
