package Java_Basics_Progs;

public class Lab020_Function2 {
    public static void main(String[] args) {
        func1(); // function is getting called
        noReturn2();
        System.out.println(returnHardCode3()); //coz there is no SOP statement in the func u need to write it here
        System.out.println(sum4(489,677));
        details5("cherry", 36);
    }

    static void func1() {
        // No parameter No return type
    }

    static void noReturn2() {
        System.out.println("Learning"); //without parameter n return type also it gives output
    }

    static int returnHardCode3() {
        return 10; // return type without parameter
    }

    static int sum4(int a,int b){
        return a+b; //return type with parameter
    }

    static void details5(String name, int age){
        //with prameter without return type
    }

}
