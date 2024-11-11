package Nov.ex_06112024_OOPs_Constructors;

public class Car {
    String model;
    int year;
    String name;


    // Default Constructor
    Car(){
        name = "Unknown Name";
        model = "xyz";
        year = 0;
        System.out.println("Dc is executed");
    }
}
