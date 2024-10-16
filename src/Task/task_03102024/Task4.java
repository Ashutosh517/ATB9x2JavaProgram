package Task.task_03102024;

public class Task4 {
    public static void main(String[] args) {
        // Find the Maximum number a, b ,c using ternary operator
        int a = 50;
        int b = 20;
        int c = 30;
        int max =  a > b ? a : b ;
        int max1 = max > c ? max : c;
        System.out.println(max1);
    }
}
