package Java_Basics_Progs;

public class Lab007_ComparativeOperator {
    public static void main(String[] args) {
        int a = 80;
        int b= 70;
        int c =60;

        System.out.println("a > b = " + (a>b));
        System.out.println("b > c = " + (b>c));
        System.out.println("a > c = " + (a>c));
        System.out.println("b > a = " + (b>a));
        System.out.println("c > b = " + (c>b));
        System.out.println("c > a = " + (c>a));


        System.out.println("*****************");

        boolean d = true;
        boolean e = false;
        System.out.println("d && e = " + (d && e));
        System.out.println("e && e = " + (e && e));
        System.out.println("d && d = " + (d && d));
        System.out.println("d || e = " + (d || e));
        System.out.println("d || d = " + (d || d));
        System.out.println("e || d = " + (e || d));
        System.out.println("!e : " + (!e));
        System.out.println("!d : " + (!d));

    }
}
