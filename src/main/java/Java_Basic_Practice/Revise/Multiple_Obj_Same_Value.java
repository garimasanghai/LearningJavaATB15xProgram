package Java_Basic_Practice.Revise;

import java.util.Scanner;

public class Multiple_Obj_Same_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code: ");
        int code = sc.nextInt();

        if(code < 111 || code > 125){
            System.out.println("Check the code number");
        }
        else{
            switch (code){
                case 111, 112, 113:
                    System.out.println("Grocery,Aisle 1");
                    break;
                case 114, 115:
                    System.out.println("Beverage, Aisle 6");
                    break;
                case 116, 117, 118:
                    System.out.println("Baby Food & Products, Aisle 2");
                    break;
                case 119, 120:
                    System.out.println("Household Items, Aisle 4");
                    break;
                case 121, 122, 123:
                    System.out.println("Condiments, Aisle 3");
                    break;
                default:
                    System.out.println("Item out of stock");
            }
        }
        sc.close();
    }
}
