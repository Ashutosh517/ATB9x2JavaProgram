package Nov.ex_18112024_Exceptions_Part2;

public class Lab181_Exception_OKOK {
    public static void main(String[] args) {
        int a = 0;
        int c =0;
        try {
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
