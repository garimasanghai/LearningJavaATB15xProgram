package Java_Concepts.Wrapper_Exceptions;

public class exceptionsDemo7 {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Can't do trim for Null, ARE you mad?");
        }
        System.out.println("End");
    }
}
