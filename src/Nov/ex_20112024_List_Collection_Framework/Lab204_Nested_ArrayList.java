package Nov.ex_20112024_List_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab204_Nested_ArrayList {
    public static void main(String[] args) {

        List fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("patato");
        vegatables.add("tomato");
        vegatables.add("chily");
        System.out.println(vegatables);



        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegatables);
        System.out.println(all_fruits);
    }
}
