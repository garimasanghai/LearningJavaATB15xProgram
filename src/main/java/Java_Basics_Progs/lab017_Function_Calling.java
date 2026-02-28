package Java_Basics_Progs;

public class lab017_Function_Calling {

    public static int sum(int a, int b){
        int c = a+b;
        return c;
    }

    public static void name_fucntion(){
        System.out.println("Hi");
        }

    public static void main(String[] args) {
        int result =sum(5,9);
        System.out.println(result);
        name_fucntion();
    }
}
