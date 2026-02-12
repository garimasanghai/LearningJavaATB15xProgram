package Java_Basics_01;

public class Lab023_StaticKeyword {
    static int emp_id = 101;

    Lab023_StaticKeyword(){ //zero parameterised constructor
        emp_id ++;
        System.out.println(emp_id);
    }

    public static void main(String[] args) {
        Lab023_StaticKeyword sk = new Lab023_StaticKeyword(); // calling zero parameterised constructor
        Lab023_StaticKeyword sk1 = new Lab023_StaticKeyword ();
    }
}
