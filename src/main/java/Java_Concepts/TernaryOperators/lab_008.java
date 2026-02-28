package Java_Concepts.TernaryOperators;

public class lab_008 {
    public static void main(String[] args) {
        // Ternary operator, similar to if, else
        //Syntx- result = condition? "Expression1" : "Expression2"
        //Exp1 will be exe if the cond? is true, else Exp2 will be exe

        int num = -5;
        String result = num > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
