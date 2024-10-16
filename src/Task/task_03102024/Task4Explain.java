package Task.task_03102024;

public class Task4Explain {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // In the future, we will ask the user for these value
        // we will take user input

        // Rough Logic
        // a >= b && a >= c -> a : b >= c --> b : c
        int result = (a >= b && a >= c) ? a : (b >=c ? b :c);
        System.out.println("Max Number is -> "+ result);


    }
}
