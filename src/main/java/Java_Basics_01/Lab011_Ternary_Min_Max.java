package Java_Basics_01;

public class Lab011_Ternary_Min_Max {
    public static void main(String[] args) {

        int a = 400;
        int b = 1000;
        int c = 90;

        int max = a > b && a > c ? a : b > c ? b : c;
        System.out.println("Max is: " + max);

        int min = a < b && a < c ? a : b < c ? b : c;
        System.out.println("Min is: " + min);

    }
}
