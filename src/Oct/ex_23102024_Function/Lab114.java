package Oct.ex_23102024_Function;

public class Lab114 {
    public static void main(String[] args) {
        // User Defined Functions.
        //
        // 1. Without Argument/Parameters and Without Return Type.
        // 2. Without Parameters but with Return Type.
        // 3. With Parameters and without Return Type.
        // 4. With Parameters and With Return Type.


        // 1. Without Argument/Parameters and Without Return Type.
        for (int i = 0; i < 99; i++) {
            greet();
        }


        // 2. Without Parameters but with Return Type.
        String returned_value = greet_with_hello();
        System.out.println(returned_value);

        int voting_age = age_of_vote();
        System.out.println(voting_age);
        if (voting_age >= 18) {
            System.out.println("You are allowed to vote!");
        } else {
            System.out.println("Not Allowed!");
        }

        // 3. With Parameters and without Return Type.
        greet_with_your_name("Pramod");
        greet_with_your_name("Ashutosh");
        greet_with_your_name(" Amit");
        greet_with_your_name("Balaji");

        greet_with_first_name_last_name("Ashutosh", " Mall");


        // 4. With Parameters and With Return Type.
       int result = sum_of_two_number(3,4);
        System.out.println(result);


    }
    //  Without Parameters and Without Return Type.(Declare) / Define

    static void greet() {
        System.out.println("Hi, How are you");
    }

    // 2. Without Parameters but with Return Type.
    static String greet_with_hello() {
        // Write the code
        System.out.println("Hi, I am type 2");
        return "Hi, you are awesome";
    }

    static int age_of_vote() {
        // write the code
        System.out.println("Vote age Returned!");
        return 18;
    }

    // 3. With Parameters and without Return Type.(void)
    static void greet_with_your_name(String name) {
        System.out.println("Hi Your name is " + name);
    }

    static void greet_with_first_name_last_name(String firstname, String lastname) {
        System.out.println("Hi your name is " + firstname + " " + lastname);
    }

    // 4. With Parameters and With Return Type.
    static int sum_of_two_number(int a,int b){
        return a+b;
    }

}
