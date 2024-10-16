package Task.task_03102024;

public class Task15102024ID1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        // A -> ++a -> 9 , a -> 9
        // +
        // B -> a++ -> 9 , a -> 10
        // +
        // C -> a-- -> 10 , a-> 9
        // A+B+C -> 9+9+10
    }
}
