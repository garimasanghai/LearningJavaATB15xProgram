package Java_Concepts.Wrapper_Exceptions;

public class exceptionsDemo4 {
    public static void main(String[] args) {
        System.out.println("Start of program");

        String ip = args[0]; // ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // NumberFormatException: For input string: "pramod"
        int b = 1000 / a; // ArithmeticException: / by zero
        System.out.println(b);

        System.out.println("End of program");


        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab174_Exception.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program with exception

    }
}
