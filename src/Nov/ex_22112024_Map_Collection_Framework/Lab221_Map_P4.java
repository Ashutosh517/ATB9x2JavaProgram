package Nov.ex_22112024_Map_Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab221_Map_P4 {
    public static void main(String[] args) {

        HashMap<String,String> student1 = new HashMap();
        student1.put("name","Pramod");
        student1.put("roll","1");
        student1.put("phone","784567832");
        System.out.println(student1);


        HashMap<String,String> student2 = new HashMap();
        student2.put("name","Amit");
        student2.put("roll","2");
        student2.put("phone","1234567890");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);





    }
}
