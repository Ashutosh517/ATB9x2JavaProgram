package Nov.Ex_15112024_Wrapper_Exceptions_Part2;

public class Lab174_Exception_Example {
    public static void main(String[] args) {

        String ip= args[0]; // ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // NumberFormatException: For input string: "Pramod"
        int b = 1000/a; // ArithmeticException: / by zero
        System.out.println(b);

        System.out.println("End of Program");


        // JVM will be Initialized(From RAM)
        // Create and Starts the main Thread. - Main called
        // 1) Collects the Command Line Argument - 10
        // String[] args = {10} ->
        // 2) Lab174_Exception.main()
        // Now Control will be transferred from main Thread to main method
        // when problems comes in main -> JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program with exception


    }

}
