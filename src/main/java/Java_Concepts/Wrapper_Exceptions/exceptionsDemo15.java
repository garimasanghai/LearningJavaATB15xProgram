package Java_Concepts.Wrapper_Exceptions;

public class exceptionsDemo15 {
    public static void main(String[] args) {
        //Multiple try with multiple catch
        System.out.println("Start of the program");

        String ip = null; // ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        int b = 0; // ArithmeticException
        try {
            b = 1000 / a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}
