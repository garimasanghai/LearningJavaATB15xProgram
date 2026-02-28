package Java_Concepts.Array_Basics;

// in case of Array for loop will start from 0
public class lab_054arrayMaxMinInterview {
    public static void main(String[] args) {
        int[] marks = {21, 35, 55, 87, 32, 67, 89, 90};
        int maximum = maxValue(marks);
        int minimum = minValue(marks);
        System.out.println("Max value is: " + maximum);
        System.out.println();
        System.out.println("Min value is: " + minimum);

    }

    static int maxValue(int[] marks) {
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) { //If value of marks > the max value, the statement turns true
                max = marks[i];   // the value of marks will go n sit in Max
            }
        }
        return max;
    }

    static int minValue(int[] marks) {
        int min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) { //If value of marks is smaller than the min value
                min = marks[i];
            }
        }
        return min;
    }
}