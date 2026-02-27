package OOPS_Concepts.Encapsulation;

public class lab_076encapsulationDemo2 {
    public static void main(String[] args) {
        Person p1 = new Person("P","123");
        p1.getName();
        p1.setName("pramod");
        // p1.name
        // p1.phone_no
    }

}


class Person{
    private String name;
    private String phone_no;


    public Person(String name, String phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}
