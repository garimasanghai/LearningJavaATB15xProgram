package SDET_Interview_Questions;

import java.util.Scanner;

public class Lab001_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("Enter year: ");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " :is a leap year");
                break;
            } else {
                System.out.println(year + " :not a leap year");
            }
        }
        sc.close();
    }
}
