package Oct.ex_25102024_String;

public class Lab122_string_equals_part2 {
    public static void main(String[] args) {
        String s1 = "Hello";// sored in SCP
        String s4 = "Hello";// SCP

        String s2 = new String("hello"); // Object Area
        String s3 = new String("hello"); // OA
        String s5 = new String("Hello");

        // 1 SCP , 3 OA
        // == -> Comparson
        System.out.println(s1 == s3);// false
        System.out.println(s1 == s2);// false
        System.out.println(s2 == s3);// false
        System.out.println(s1 == s4);// true - SCP - Hello
        System.out.println(s3 == s5);

        // equals (content)-> value
        // How can I check the Values ? equals == value

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

    }
}
