package Revision_Concepts;
 /*
 * Determine whether a given year is leap year or not
 * year % 4 == 0 && year % 100!= 0 OR year % 400 == 0
 */


import java.util.Scanner;

public class Lab008_LeapYearUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " not a leap year");
        }
    }
}
