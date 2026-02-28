package Java_Concepts.Wrapper_Exceptions;

public class demo1 {
    public static void main(String[] args) {
        // Primitive to Wrapper class

        int a = 10;
        Integer b = a; // Boxing - int -> Integer

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        b.intValue();


        Integer a2 = 42;
        int value = a2; // Unboxing - Integer -> int
        System.out.println(value);

    }
}
