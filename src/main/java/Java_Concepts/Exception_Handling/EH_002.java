package Java_Concepts.Exception_Handling;

public class EH_002 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try{
            int c = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
