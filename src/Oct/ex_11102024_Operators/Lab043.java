package Oct.ex_11102024_Operators;

public class Lab043 {
    public static void main(String[] args) {
        String first_name = "Ashutosh";
        String last_name = "Mall";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // AshutoshMall1010 -> first operator + -> performed as concatenation
        System.out.println(a + b + first_name + last_name);
        // First + --> math --> 20AshutoshMall

        System.out.println(first_name + last_name + (a +b));
        // BOADMASS
    }
}
