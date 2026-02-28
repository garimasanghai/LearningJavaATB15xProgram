package OOPS_Concepts.StaticKeyword;

public class Demo01 {

    void display(){
        System.out.println("Non-static method can be accessed via Obj creation only");
    }

    static void display1(){
        System.out.println("Static method can be accessed via Class name only");
    }

    public static void main(String[] args) {
        Demo01 demo = new Demo01();
        demo.display(); //for regular methods, u need to call via obj creation
        Demo01.display1(); //for static, u can access it via class name
    }
}
