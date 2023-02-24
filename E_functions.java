// FUNCTIONS

public class E_functions {

    // Void Function
    public static void gm() {
        System.out.println("Good Morning");
    }

    // Int Function
    public static int sum(int a, int b) {
        return a + b;
    }

    // String Function
    public static String massager(int num, int num2) {
        return "" + num + num2;
    }

    // Method Overloading Function1
    public static int num(int a, int b) {
        return a + b;
    }

    // Method Overloading Function2
    public static int num(int a, int b, int c) {
        return a + b + c;
    }

    // Array Parametrised Function
    public static void summer(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println(sum);
    }

    // Recursive Function
    public static int Recursive(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Recursive(num - 1);
        }
    }

    public static void main(String[] args) {

        // Function Call
        gm();
        System.out.println(sum(2, 3));
        System.out.println(massager(2, 2));

        // Method Overload Function
        System.out.println(num(1, 2));
        System.out.println(num(1, 2, 6));

        // Array Parametrised Function Acsess
        summer(2, 3, 3, 4, 4, 5, 5, 6, 7, 7);
        summer(2, 3, 3);
        summer(2, 3, 77, 89, 9, 03);

        // Recursive function call
        System.out.println(Recursive(5));
    }
}
