package Java_Concepts.Wrapper_Exceptions;

public class exceptionsDemo14 {
    public static void main(String[] args) {
        //Either use multiple catch or u can use OR |
        int b = 0; // ArithmeticException
        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000/a;
        } catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
