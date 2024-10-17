package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab066_if {
    public static void main(String[] args) {
       // int age = 20;// this is hard coded
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        if(age > 18){
            System.out.println("Allowed to vote!");
        }
    }
}
