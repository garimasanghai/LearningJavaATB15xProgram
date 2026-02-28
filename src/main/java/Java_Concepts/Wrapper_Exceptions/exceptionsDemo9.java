package Java_Concepts.Wrapper_Exceptions;

public class exceptionsDemo9 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c); // java.lang.ArithmeticException
    }
}
