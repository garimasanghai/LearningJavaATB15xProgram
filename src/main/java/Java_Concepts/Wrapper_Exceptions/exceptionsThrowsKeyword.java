package Java_Concepts.Wrapper_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Where to use throws keyword and why
// Exception < Throwable < Object
public class exceptionsThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException,Exception {
        // Throws - Checked
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
