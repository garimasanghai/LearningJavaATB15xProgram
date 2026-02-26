package OOPS_Concepts.SuperKeyword;

//For Super the concept of Inheritance is necessarys
public class Super_Keyword1 {

    int a = 10;
}

class B extends Super_Keyword1 {
    int a = 20;

    void show(int a) {
        System.out.println(a);
        System.out.println("This refers to current class ref var: " + this.a);
        System.out.println("Super refers to parent class ref var: " + super.a);
    }

    public static void main(String[] args) {
        B ob1 = new B();
        ob1.show(88);
    }
}

