package Oct.ex_10102024_Constants_Literals;

public class Lab030 {
     int i_age;// Instance Variable
     static  int s_age;// static variable
    public static void main(String[] args) {
        int age;// Default value of the local variable is not assigned by the
        // JVM.(Show error)
        // default values
        // int->0,short 0, byte 0
        // String->null
        // long -> 0, float 0.0 , double 0.0
        // char-> 0 (ASCII),(Unicode) \u0000

        age = 100;
        System.out.println(age);
      //  System.out.println(i_age);// Instance variable is not allowed in main method
        System.out.println(s_age); // static variable is allowed in main method
    }
}
