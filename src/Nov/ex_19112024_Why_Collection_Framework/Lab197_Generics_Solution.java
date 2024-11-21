package Nov.ex_19112024_Why_Collection_Framework;

public class Lab197_Generics_Solution {
    public static void main(String[] args) {

        temp_sum(23,45);
        temp_sum("Pramod","Dutta");
        temp_sum(true,false);

        // T -> any data Type. In future we use any data type
    }

    public static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
