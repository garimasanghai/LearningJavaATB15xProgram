package Java_Basics_01;

import java.util.Scanner;

public class Lab015_Switch_MultipleValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code: ");
        int code = sc.nextInt();

        if(code < 111 || code > 125){
            System.out.println("Check your Code");
        }
        else{
            switch(code){
                case 111,112,113:
                    System.out.println("Grocery");
                    break;
                case 114,115:
                    System.out.println("Electronic Gadget");
                    break;
                case 116,117:
                    System.out.println("Medicine");
                    break;
                case 118:
                    System.out.println("Home Appliance");
                    break;
                case 119, 120:
                    System.out.println("Edible");
                    break;
                default:
                    System.out.println("Item unavailable");
                    break;
            }
        }
        sc.close();
    }
}
