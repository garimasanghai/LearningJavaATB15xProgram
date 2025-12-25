package Java_Basics_01;

import java.util.Scanner;

public class Lab_013_Switch_UserInput_IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = sc.nextInt();

        if (day < 1 || day > 7) {
            System.out.println("Give a Valid Input");
        } else {
            switch (day) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
            }
        }
        sc.close();
    }
}
