package OOPS_Concepts.Constructors;

public class Cons_Demo01 {
    String name;
    int id;

    public Cons_Demo01(){

        System.out.println("Calling default constructor ..");
    }

    public Cons_Demo01(String name, int id){
        System.out.println("Calling parameterised constructor ..");
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Cons_Demo01 cd1 = new Cons_Demo01(); // calling default constructor
        Cons_Demo01 cd = new Cons_Demo01("Abc", 101); //calling parameterised constructor
        System.out.println(cd.name + ":" + cd.id);
    }
}
