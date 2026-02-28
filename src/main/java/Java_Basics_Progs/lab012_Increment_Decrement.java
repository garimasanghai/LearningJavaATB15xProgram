package Java_Basics_Progs;

public class lab012_Increment_Decrement {
    public static void main(String[] args) {
        /*
        int a= 20;
        System.out.println(++a + a++ + ++a); //65
        System.out.println(a); // a is initialized thrice in line 6
        */

        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a); // 10 + 11 + 12 = 33

        int c = 3;
        int b = c++ * ++c;
        System.out.println(b); // 3 * 5 = 15

        int d = 5;
        System.out.println(d++ + d--); //5 + 6 = 11
    }
}
