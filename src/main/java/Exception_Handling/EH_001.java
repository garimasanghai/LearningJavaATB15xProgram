package Exception_Handling;

public class EH_001 {
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff(){
        doMoreStuff();
    }

        public static void doMoreStuff () {
            try {
                System.out.println(100 / 0);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
