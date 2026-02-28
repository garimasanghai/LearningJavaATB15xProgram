package Java_Concepts.Wrapper_Exceptions;

public class conversionDemo2 {
    public static void main(String[] args) {
        String num = "10";
        // String -> Wrapper(Integer) -> Primitive Int
        Integer a = Integer.valueOf(num);
        int a2 = a;// unboxing

        // String to Primitive
        int a3  = Integer.parseInt(num);

        Long l = 10l;
        Short s= 23;
        Boolean bb = true;


    }
}
