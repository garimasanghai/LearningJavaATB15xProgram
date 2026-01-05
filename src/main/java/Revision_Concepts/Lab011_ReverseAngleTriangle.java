package Revision_Concepts;

public class Lab011_ReverseAngleTriangle {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) { //First nested for loop to print space, second for loop to print *
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { //no nested For loop after this, coz nothing needs to be repeated after that
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------");

        for (int x = 1; x <= num; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(" ");
            }
            for (int z = 5; z >= x; z--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------");
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------");

        for(int i =1; i<=num; i++){
            for(int j =1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = num; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}