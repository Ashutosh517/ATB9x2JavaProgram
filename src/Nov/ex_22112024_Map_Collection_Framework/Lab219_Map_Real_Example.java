package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab219_Map_Real_Example {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("name","Sobha");
        student1.put("phone","9829292929");
        student1.put("address","GKP");
        System.out.println(student1);


        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);



    }
}
