package Java_Basic_Practice.Revise;

public class Types_of_Methods {

    /*
     1.Without Parameters and Without Return Type
     2.Without Parameters but With Return Type
     3.With Parameters and Without Return Type
     4.With Parameters and With Return Type
     */

    static void greet(){
        System.out.println("Without Parameters and Without Return Type . .");
    }

    public static String greeting(){
        System.out.println("Without Parameters but With Return Type . .");
        return "Hi . .";
    }

    public static void greetings (String hello){
        System.out.println("With Parameters and Without Return Type . .");
    }

    public static int sum( int a, int b){
        System.out.println("With Parameters and With Return Type . .");
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        greet();
        greeting();
        greetings("Hi");
        sum(8, 7);
    }
}
