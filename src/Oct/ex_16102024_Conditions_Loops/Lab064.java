package Oct.ex_16102024_Conditions_Loops;

public class Lab064 {
    public static void main(String[] args) {
        // Create a Program to check whether ashutosh will go to goa OR not
        // take a input age = Ashutosh -> Goa
        // age -> 25 -->Drinking ->Goa
        // Ternary operator

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s , %s , %s ",args[0],args[1],args[2]);

        int age = Integer.parseInt(args[1]);
        System.out.println(age >= 25 ? "Allowed to goa" : "Not Allowed");
    }
}
