package Java_Concepts.Wrapper_Exceptions;

public class exceptionsDemo3 {
    public static void main(String[] args) {
        System.out.println("Start of program");

        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 1000 / a;
        System.out.println(b);

        System.out.println("End of program");


        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab174_Exception.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM

    }
}
