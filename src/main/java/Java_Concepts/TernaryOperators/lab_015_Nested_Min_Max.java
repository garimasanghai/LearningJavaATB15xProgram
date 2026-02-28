package Java_Concepts.TernaryOperators;

public class lab_015_Nested_Min_Max {
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        int c = 90;

        // nested, in other words nested if else

        int maxVal =(a> b && a > c) ? a :(b>c)? b:c;
        System.out.println("Max value = " + maxVal);

        int minVal = (a<b && a<c) ? a :(b<c)? b : c;
        System.out.println("Min value = " + minVal);
    }
}
