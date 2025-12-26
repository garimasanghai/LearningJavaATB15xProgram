package Java_Interview_QA;

/*
Write a program that prints numbers from 1 to 100.
However, for multiples of 3, print "Fizz" instead of the number, &
For multiples of 5, print "Buzz" instead of the number
For numbers that are multiples of both 3 and 5, print "FizzBuzz."
*/

public class Lab002_FizzBuzz {
    public static void main(String[] args) {
        int i;
        for(i = 1; i <=100; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

