package Java_Concepts.ForLoop;

public class lab_040infiniteLoopExamples {

    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
        }
        // exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
        // exit code 0 - Successful
    }

}
