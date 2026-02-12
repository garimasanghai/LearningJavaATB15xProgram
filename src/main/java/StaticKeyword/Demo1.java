package StaticKeyword;

public class Demo1 {

    void display(){
        System.out.println("Non-static method can be accessed via Obj creation only");
    }

    static void display1(){
        System.out.println("Static method can be accessed via Class name only");
    }

    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        demo.display(); //for regular methods, u need to call via obj creation
        Demo1.display1(); //for static, u can access it via class name
    }
}
