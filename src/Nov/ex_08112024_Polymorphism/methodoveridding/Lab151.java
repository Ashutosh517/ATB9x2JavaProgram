package Nov.ex_08112024_Polymorphism.methodoveridding;

import Nov.ex_08112024_OOPs_Inheritance.hierarchical.Father;

public class Lab151 {
    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.home();

        father f = new father();
        f.home();

        // Dynamic Dispatch
        father f1 = new Pramod();
        f1.home();

        // Pramod p1 = new father(); // Not Possible
       //  p1.home
    }
}
class father{
    void home(){
        System.out.println("2BHK");
    }
    void f2(){

    }
}

class Pramod extends father{

    // Override
    void home(){
        System.out.println("3BHK");
    }
    void f1(){

    }
}
