package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.Stack;

public class Lab210_Stack {
    public static void main(String[] args) {
        // Stack
        // List in --> First out
        // Vector,Stack - Legacy Classes
        // 95% of time we are not going to use it in automation
        // ArrayList - 95% we are going to use

//        Stack s = new Stack();
//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s);

        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.add("Amit2");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());// whose at the top
        System.out.println(s.pop());// Remove the element on the top
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Dutta"));// Add on the top
        System.out.println(s);
        s.add("Chetana");
        s.push("Vijay");
        System.out.println(s);

        s.add(0,"Luckey");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));



    }
}
