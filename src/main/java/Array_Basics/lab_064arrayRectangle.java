package Array_Basics;

import java.util.Scanner;

public class lab_064arrayRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Rectangle,enter the size of rows");
        int rows = sc.nextInt();
        System.out.println("For Rectangle,enter the size of columns");
        int columns = sc.nextInt();
        int [] rowsize = new int[rows];
        int [] columnSize = new int[columns];
        if(rows == columns){
            System.out.println("Invalid Data. Provide different sizes for Rectangle");
        }
        else {
            for (int i = 0; i < rowsize.length; i++) {
                for (int j = 0; j < columnSize.length; j++) { // will always give u columns
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }
}
