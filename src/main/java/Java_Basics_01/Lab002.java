package Java_Basics_01;

public class Lab002 {
    public static void main(String[] args) {

        int a = 500;
        int b = 40;
        int c= -502;
        double res = a + b;
        System.out.println(res);

        byte res1 = (byte) (a+b);
        System.out.println(res1);

        byte res2 = (byte)(a-c);
        System.out.println(res2); //data loss, coz the num will be changed to binary then be executed

        int res3 = a-c; // 500 - (-502)
        System.out.println(res3);

        int res4 = c+a; // -502 + 500
        System.out.println(res4);

    }
}
