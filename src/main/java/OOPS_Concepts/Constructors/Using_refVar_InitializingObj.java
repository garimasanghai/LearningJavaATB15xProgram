package OOPS_Concepts.Constructors;


//Constructor is used to initialize an obj
public class Using_refVar_InitializingObj {

    String empName;
    int empId;

    Using_refVar_InitializingObj(String empName, int empId){
        this.empId= empId;
        this.empName = empName;
    }

    //Initializing obj after creation
    public static void main(String[] args) {
        Using_refVar_InitializingObj ur = new Using_refVar_InitializingObj("Deepak", 101);
        Using_refVar_InitializingObj ur2 = new Using_refVar_InitializingObj("Cherry", 107);
        System.out.println("Employee 1: " + ur.empId + " " +  ur.empName);
        System.out.println("Employee 2: " +ur2.empId + " " +  ur2.empName);

    }
}
