package Java_Concepts.TernaryOperators;

public class lab_011score_Nested_IfElse {
    public static void main(String[] args) {

        // Nested Ternary
        //Syntax:- result = (condition1)? "expression1" : (condition2)? "expression2" : "expression3";

        int score = 88;
        String grade = (score > 90)? "A": (score > 85)? "B" : (score < 60)? "Impove": "Fail";
        System.out.println("Grade " + grade);

        //If the score is 90 or above, the grade will be "A"
        //If the score is between 80 and 89, the grade will be "B"
        //If the score is between 70 and 79, the grade will be "C"
        //If the score is between 60 and 69, the grade will be "D"
        //If the score is below 60, the grade will be "F"

        /*int score = 82;
        String grade= (score >= 90)? "A" : (score>= 80)? "B" : (score >= 70)? "C" : (score >=60)?"D" : "F";
        System.out.println("Your grade is : " + grade);
        System.out.printf("Your grade is : %s", grade);
*/


    }
}
