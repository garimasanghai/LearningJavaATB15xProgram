package Java_Concepts.Wrapper_Exceptions;

public class exceptionsDemo17 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a= 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by Zero");
            //Not showing any exception msg coz u have given what to print
            //will show exception msg only if u wrire(e.getMessage());
        } finally {
            System.out.println("I will be executed anyHow!!");
        }
    }
}
