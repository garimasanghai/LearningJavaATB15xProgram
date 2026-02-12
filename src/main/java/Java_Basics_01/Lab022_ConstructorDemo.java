package Java_Basics_01;

public class Lab022_ConstructorDemo {
    String name;
    int id;

    public Lab022_ConstructorDemo(){
        System.out.println("Calling default constructor ..");
    }

    public Lab022_ConstructorDemo(String name, int id){
        System.out.println("Calling parameterised constructor ..");
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Lab022_ConstructorDemo cd1 = new Lab022_ConstructorDemo(); // calling default constructor
        Lab022_ConstructorDemo cd = new Lab022_ConstructorDemo("Abc", 101); //calling parameterised constructor
        System.out.println(cd.name + ":" + cd.id);
    }
}
