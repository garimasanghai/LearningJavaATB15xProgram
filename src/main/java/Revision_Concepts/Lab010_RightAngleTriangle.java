package Revision_Concepts;

import java.util.Scanner;

// https://www.youtube.com/watch?v=stFbAQUSEnQ&list=PLlhM4lkb2sEiScGRZEHkHsI1ncXKLq5Zp&index=1&t=7s

public class Lab010_RightAngleTriangle {
    public static void main(String[] args) {
        int n = 5; //“I want 5 rows”

        for (int i = 1; i <= n; i++) { // For ROWS: make rows one by one”
            for (int j = 1; j <= i; j++) { // For COLUMNS: Inside each Row, how many stars
               /*
               Outer loop = rows, Inner loop = stars in each row
               Inside each Row, how many stars:
                Row 1 → 1 star  ⭐
                Row 2 → 2 stars ⭐⭐
                Row 3 → 3 stars ⭐⭐⭐
                The number of stars is same as the row number
                */
                System.out.print(" * ");
            }
            System.out.println(); // After each row → go to next line
        }
    }
}
