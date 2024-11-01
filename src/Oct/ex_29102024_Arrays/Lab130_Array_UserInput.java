package Oct.ex_29102024_Arrays;

import java.util.Scanner;

public class Lab130_Array_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Number" +(i+1));
            number[i] = sc.nextInt();
        }

        System.out.println("- - - - -  - - ");
        // Print the numbers entered by the user
        System.out.println("The number are:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);  
        }

    }
}
