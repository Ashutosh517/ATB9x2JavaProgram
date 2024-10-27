package Oct.ex_25102024_String;

public class Lab120 {
    public static void main(String[] args) {
        String name = "Pramod"; // This is store in string constant pool
        name = "Datta";
        name  = "PramodData";
        name = "Pramod";
        System.out.println(name);


        // String -> Data type
        // name -> Ref
        // = -> assignment operator
        // "Pramod" -> literal (String)



        String name2 = new String("Pramod");// this is store in heap area
        String name3 = new String("Pramod");
        String name5 = name2;
    }
}
