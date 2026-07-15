package OOPS_Concepts.Constructors;

//Constructor is used to initialize an obj
public class RefVar_Ini_Obj {

    String empName;
    int empId;

    RefVar_Ini_Obj(String empName, int empId){
        this.empId= empId;
        this.empName = empName;
    }

    //Initializing obj after creation
    public static void main(String[] args) {
        RefVar_Ini_Obj ref1 = new RefVar_Ini_Obj("Deepak", 101);
        RefVar_Ini_Obj ref2 = new RefVar_Ini_Obj("Cherry", 107);
        System.out.println("Employee 1: " + ref1.empId + " " +  ref1.empName);
        System.out.println("Employee 2: " +ref2.empId + " " +  ref2.empName);

    }
}
