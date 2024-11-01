package Oct.ex_29102024_Arrays;

public class Lab125_Arrays_P1 {
    public static void main(String[] args) {
        int[] marks = {51,100,91,87,90,91,92};
        // Array create in the memory -> 0 to 6
        // Array Creation with the pre-defined element.
        System.out.println(marks[0]);
        System.out.println(marks[4]);
       // System.out.println(marks[10]); // ArrayIndexOutOfBoundsException

        System.out.println(marks.length);// Always start from 1
    }
}
