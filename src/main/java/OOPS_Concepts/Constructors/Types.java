package OOPS_Concepts.Constructors;

public class Types {
    String name;
    Types(){
        System.out.println("Calling No args Cons");
    }

    Types(String name){
        this.name = name;
        System.out.println("Calling Parameterised Cons");
    }

    public static void main(String[] args) {
        Types tt = new Types();
        Types tt1= new Types("Abc");
    }
}
