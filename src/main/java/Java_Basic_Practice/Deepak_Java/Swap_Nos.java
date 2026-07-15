package Java_Basic_Practice.Deepak_Java;

public class Swap_Nos {
    public static void main(String[] args) {

        int num = 20, num1 = 30;

        System.out.println("Initial First num: " + num);
        System.out.println(("Initial Second num: " + num1));

        int temp = num;
        num = num1;
        num1 = temp;
        System.out.println("Num: " + num);
        System.out.println("Num1: " + num1);
    }
}
