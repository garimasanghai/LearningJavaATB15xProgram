package Java_Concepts.Wrapper_Exceptions;

public class finally_not_exe {
    public static void main(String[] args) {
        //When will finally not get exe
        //When u write System.exit earlier, finally won't get exe
        try {
            int a = 10/10;
            //System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Not Printed");
        }
    }
}
