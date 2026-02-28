package Java_Concepts.Array_Basics;

public class lab_059arrayForEach {
    public static void main(String[] args) {
        int [] a = new int[2];
        a[0] = 50;
        a[1] = 51;
        for(int value : a){ // For every integer value in case of a, print value
            System.out.println(value);
        }

        String [] name = {"Bill", "Jill", "Till"};
        for (String names : name){
            System.out.println(names);
        }

        //Syntax: for(dataType itemName : variableName){
        //              code...
        //         System.out.println(itemName);
    }
}
