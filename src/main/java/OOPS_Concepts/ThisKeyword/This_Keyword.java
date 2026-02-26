package OOPS_Concepts.ThisKeyword;

class This_Keyword {

    int i;
    int j;

    void set_values(int x, int j) {
        i = i;
        this.j =j; //the value gets instantiated when u use this.
    }

    void display() {
        System.out.println("Value of i " + i);
        System.out.println("Value of j " +j);
    }
}

class Test {
    public static void main(String[] args) {
        This_Keyword tk = new This_Keyword();
        tk.set_values(81, 99);
        tk.display();
    }
}
