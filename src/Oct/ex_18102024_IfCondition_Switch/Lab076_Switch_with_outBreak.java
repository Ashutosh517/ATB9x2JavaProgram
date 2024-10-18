package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab076_Switch_with_outBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from (1 - 7)");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("tue");

            case 3:
                System.out.println("Wed");

            case 4:
                System.out.println("Thu");
                break;

            case 5:
                System.out.println("Fri");

            case 6:
                System.out.println("Sat");

            case 7:
                System.out.println("Sun");

            default:
                System.out.println("No idea, what day its");


        }
        System.out.println("End the Loop");
        sc.close();
    }
}
