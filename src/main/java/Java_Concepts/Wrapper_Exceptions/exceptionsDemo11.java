package Java_Concepts.Wrapper_Exceptions;

public class exceptionsDemo11 {
    public static void main(String[] args) {
        int a = 1;
        int c = 0;
        try {
            c = 10 / a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {    // finally block will always get executed regardless
            System.out.println("I will be always executed");
        }
    }
}
