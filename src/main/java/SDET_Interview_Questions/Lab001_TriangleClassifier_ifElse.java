package SDET_Interview_Questions;
 /*
 (all sides are equal),
isosceles (exactly two sides are equal),
or scalene (no sides are equal).
*/

import java.util.Scanner;

public class Lab001_TriangleClassifier_ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides: ");
        int side1 = sc.nextInt();
      //  System.out.println("Side 2: ");
        int side2 = sc.nextInt();
       // System.out.println("Side 3: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3 && side3 == side1){
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }
        sc.close();
    }
}
