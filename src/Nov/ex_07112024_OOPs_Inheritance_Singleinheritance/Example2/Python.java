package Nov.ex_07112024_OOPs_Inheritance_Singleinheritance.Example2;

public class Python extends Programming {
    // Extend - is A
    // Python is a Programming
    void print(){
        System.out.println(version);
        System.out.println(author);
    }

    Python(){
        System.out.println("DC");
    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.author);
    }
}
