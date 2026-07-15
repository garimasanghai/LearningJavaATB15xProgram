package Java_Basic_Practice.Deepak_Java;

public class Constructor_01 {

    String name;
    int id;

    public Constructor_01(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Constructor_01(){
        System.out.println("Zero parameter cons called");
    }
}
