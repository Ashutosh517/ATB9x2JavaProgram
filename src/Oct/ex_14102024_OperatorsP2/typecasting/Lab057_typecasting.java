package Oct.ex_14102024_OperatorsP2.typecasting;

public class Lab057_typecasting {
    public static void main(String[] args) {
        // Type Casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type),loss

        // Widening
        byte b = 10;
        int a = b; // Valid -> Implicit Casting -> by JVM
        int a1 = (int)b;// Valid -> Explicit Casting - by JVM

        // Narrowing -> Converting -> Large data type --> Into Small
        int val = 200;
        // byte b2 = val; // Invalid - Implicit --> JVM
        byte b3 = (byte)val; // Valid - Explicit -> by user --> Data loss or overflow
    }
}
