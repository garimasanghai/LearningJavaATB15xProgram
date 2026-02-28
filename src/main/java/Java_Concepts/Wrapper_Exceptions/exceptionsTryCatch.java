package Java_Concepts.Wrapper_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionsTryCatch {
    public static void main(String[] args) {
        // Throws - Checked
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("File nai hai");
        } finally {
            System.out.println("yes");
        }

    }
}
