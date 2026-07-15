package Java_Basic_Practice.Deepak_Java;

public class Fibonacci {
    //Swapping no in the sense that subsequent no will be addition of previous 2 no's
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + ", " + num2);

        int times = 10;

        for(int i = 1; i<= times; i++){

            int sum = num1+num2;
            System.out.print(", " + sum);

            num1 = num2;
            num2 = sum;
        }
    }
}
