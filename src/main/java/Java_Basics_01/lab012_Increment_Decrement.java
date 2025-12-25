package Java_Basics_01;

public class lab012_Increment_Decrement {
    public static void main(String[] args) {
        int a= 20;
        System.out.println(++a + a++ + ++a); //65
        System.out.println(a); // a is initialized thrice in line 6
    }
}
