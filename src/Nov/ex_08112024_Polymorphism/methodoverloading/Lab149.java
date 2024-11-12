package Nov.ex_08112024_Polymorphism.methodoverloading;

public class Lab149 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        float result = mathOperations.add(3.4f, 4.5f);
        System.out.println(result);

    }
}

class MathOperations {

    // Method Overloading
    // Method will be Over Load
    // Same name but different Argument or Parameter

    int add(int a, int b) {
        System.out.println();
        return a + b;

    }
    float add (float a , float b){
        return a+b;
    }

    void add (int a , int b, int c){
        System.out.println("Hello");
    }

    double add (double a , double b){
        return a+b;
    }
}
