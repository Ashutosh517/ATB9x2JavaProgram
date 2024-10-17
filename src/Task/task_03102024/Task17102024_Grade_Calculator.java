package Task.task_03102024;

import java.util.Scanner;

public class Task17102024_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        if(score >= 90 && score <= 100){
            System.out.println("Grade is -> A");
        } else if (score <= 89 && score >= 80){
            System.out.println("Grade is -> B");
        }else if(score <= 79 && score >= 70){
            System.out.println("Grade is -> C");
        }else if(score <= 69 && score >=60){
            System.out.println("Grade is --> D");
        }
        else {
            System.out.println("Grade is ->F");
        }

    }
}
