// BASICS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_basics {
    public static void main(String[] args) throws IOException {

        // Data Types and Veriables
        int a = 4;
        double b = 5.656565656;
        String c = "parth";
        char d = 'A';
        boolean f = true;

        // Input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int e = Integer.parseInt(bf.readLine());

        // Output
        System.out.println("Hello world");
        System.out.println(a);
        System.out.println(b);
        System.out.printf("%s", c);
        System.out.format("%c", d);
        System.out.println(e);
        System.out.println(f);

        // TypeCasting
        int x = 10;
        int y = 4;
        System.out.println((float) x / y);
    }
}
