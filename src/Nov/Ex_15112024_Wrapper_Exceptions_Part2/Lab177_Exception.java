package Nov.Ex_15112024_Wrapper_Exceptions_Part2;

public class Lab177_Exception {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");

        // Unchecked - java.lang.NullPointerException
        // JVM - Compile -> JVM knows at the Runtime -> Terminated the program.

    }
}
