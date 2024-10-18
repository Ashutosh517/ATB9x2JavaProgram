package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab073_HackerrankQ {
    public static void main(String[] args) {
        // Grade Calculator
        // Write a program that calculate and displays the letter grade
        // for the given numerical score (e.g., A,B,C,D or F)
        // Based on the following grading scale:
        // A : 90-100
        // B : 80-89
        // C : 70-79
        // D : 60-69
        // F : 0-59

        // Logic Building - Java

        // Step 1
        // Finds the inputs / Outputs
        // Input /score -> (0 - 100) -> data type -> int (Ask customer)
        // Output / grade --> Data type --> Char

        // 2. Basic Logic / Rough Logic
        // if (score >= 90 && score <= 100) --> return or print grade - A
        // else if (score <= 89 && score >= 80) --> return or print grade - B
        // else if (score <= 79 && score >= 70) --> return or print grade - c
        // D,E

        // 3. Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        char grade = 'F';
        if(score >= 90 && score <= 100){
            grade = 'A';
        } else if (score <= 89 && score >= 80){
            grade = 'B';
        }else if(score <= 79 && score >= 70){
            grade = 'C';
        }else if(score <= 69 && score >=60){
           grade = 'D';
        } else if (score <= 0 || score > 100) { // Edge Case
            System.out.println("LOL !! , are you Good");
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is ->" + grade);


    }
}
