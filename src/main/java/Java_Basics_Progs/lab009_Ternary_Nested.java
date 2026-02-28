package Java_Basics_Progs;

public class lab009_Ternary_Nested {
    public static void main(String[] args) {

        int age = 20;

        String res = age == 18 ? "Shud Vote" : age >=23 ? "Can travel" : "Wait till u turn 22";
        System.out.println(res);

    }
}
