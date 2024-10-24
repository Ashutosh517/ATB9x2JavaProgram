package Oct.ex_24102024;

import java.util.Scanner;

public class Lab117 {
    public static void main(String[] args) {
        // Create a function of Sub,Sum,Mul and Div
        // with parameter a,b(Take a parameter from the user)
        //
        // 3 -> User input
        // 4 -> user input
        //
        // Sum(3,4)

        // Logic Building
        //Step 1 -> Input and output
        // a,b - int -> Scanner
        // int -> variable result ->

        // Step 2 ->Rough logic --> Create function
        // function -> type 4th - with return with arguments / parameters

        // Step 3 - write code Find and Fix --> Edge case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = scanner.nextInt();
        System.out.println("Enter the num2");
        int b = scanner.nextInt();


        int result = sum_of_numbers(a, b);
        System.out.println("Sum is -> " + result);

        int result_sub = sub_of_numbers(a, b);
        System.out.println("Sub is -> " + result_sub);

        int result_div = div_of_numbers(a, b);
        System.out.println("Div is ->" + result_div);

        int result_mul = mul_of_number(a, b);
        System.out.println("Mul is ->" + result_mul);
        int result_mod = modulus_of_number(a, b);
        System.out.println("Modulus is" + result_mod);


        scanner.close();
    }

    static int div_of_numbers(int a, int b) {
        if (b == 0) {
            System.out.println("Not allowed");
        }
        return a/b;
    }

    static int modulus_of_number(int a, int b) {
        return a % b;
    }

    static int mul_of_number(int a, int b) {
        return a * b;
    }

    static int sub_of_numbers(int a, int b) {
        return a - b;
    }

    static int sum_of_numbers(int a, int b) {
        return a + b;
    }


}
