package OOPS_Concepts.Abstraction;

public class lab_087InterfaceDemo2 {
    public static void main(String[] args) {
        P p  = new P();
        p.f1();

        //I i = new I();

    }
}

class P implements I1{

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface I1{
    void f1();
    void f2();
    void f3();
}