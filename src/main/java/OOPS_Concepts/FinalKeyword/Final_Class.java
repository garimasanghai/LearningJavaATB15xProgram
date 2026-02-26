package OOPS_Concepts.FinalKeyword;


//When u don't want the class to be inherited, u declare it Final
final public class Final_Class {
    void display(){
        System.out.println("Final class");
    }
}

class B4 {
    void show(){
        System.out.println("You r in Child class");
    }

    public static void main(String[] args) {
        B4 b4 = new B4();
        b4.show();

        Final_Class fc = new Final_Class();
        fc.display();
    }
}
