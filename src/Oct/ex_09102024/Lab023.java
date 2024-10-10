package Oct.ex_09102024;

public class Lab023 {
    int instance_variable = 10; // Instance Variable
    static int static_variable =10; // Static Variable
    public static void main(String[] args) {
        int age =10;// local Variable
        System.out.println(age);

        {
            int sachin = 10;
            System.out.println(sachin);
        }
        // System.out.println(sachin); // Not print here b/c it is not in
        // sachin bracket
    }
}
