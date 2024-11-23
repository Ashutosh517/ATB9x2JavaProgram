package Nov.ex_20112024_List_Collection_Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab206_ArrayList_Input {
    public static void main(String[] args) {
        // Multiple inputs from the user and store them in separate
        // ArrayLists Based on the user-define categories

        // name,ages - store them
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";// Control variable for the input loop

        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            names.add(name);

            System.out.println("Enter age:");
            int age = scanner.nextInt();
            ages.add(age); // Add age to the ages list

            scanner.nextLine();
            System.out.println("Do you want to enter another record? (Y/N)");
            continueInput = scanner.nextLine();
        }

        // Displaying the collected data
        System.out.println("\nNames:" + names);
        System.out.println("Ages:" +ages);

        for (Object o1: names){
            System.out.println(o1);
        }

        for (Object o2: ages){
            System.out.println(o2);
        }

        scanner.close();


    }
}
