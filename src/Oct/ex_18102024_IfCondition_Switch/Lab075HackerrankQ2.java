package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab075HackerrankQ2 {
    public static void main(String[] args) {

        // Triangle Classifier
        // Write a program that classifies a triangle base on its side length
        // Give three input values representing the lengths of the sides
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles(exactly two side are equal)
        // or scalene (no side are equal).
        // Use an If-else statement to classify the triangle.
        // side1, side2, side3 -> eq , iso, scalene
        //

        // logic building
        // Step 1
        // Find the inputs / outputs
        // Input / side1,side2,side3 -> (0 -100)--> data type -> double
        // Output / SOP -> String or message -> Eq, ISO, Scalene

        // Step 2
        // if side1 == side2 and side2 == side3 -> side1 == side3 -> eq
        // side1 == side2 || side1 == side3 || side2 == side3 -> iso
        // else -> scalene

        // step 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side 1 :");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2 :");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3 :");
        double side3 = scanner.nextDouble();

        if (side1 <=0 || side2 <= 0 || side3 <= 0){
            System.out.println("invalid input : Side lengths must be positive");
        }
        else if (side1 == side2 && side2 == side3 && side1 == side3){
            System.out.println("The triangle is equilateral.");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("The triangle is isosceles.");
        }else {
            System.out.println("The triangle is scalene");
        }
        scanner.close();

    }
}
