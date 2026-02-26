package OOPS_Concepts.SuperKeyword;


// In case of Method, Super keyword is used, In case of cons super() is used
public class Super_Calling_ParentClsMthd {

    void display() {
        System.out.println("Now you r calling Parent class method");
    }
}

class B1 extends Super_Calling_ParentClsMthd {

    void display(){          // Concept of Overriding
        System.out.println("You r in current class");
    }
    void show() {
        display();       //Current class method
        super.display(); // Parent class method
    }

    public static void main(String[] args) {
        B1 ob1 = new B1();
        ob1.show();
    }
}
