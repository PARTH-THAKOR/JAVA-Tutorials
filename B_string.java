// STRINGS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_string {
    public static void main(String[] args) throws IOException {

        // String Input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        // String Methods
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(2));
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('r', 'k'));
        System.out.println(str.substring(1, 3));
        System.out.println(str.indexOf('r'));
        System.out.println(str.indexOf('t'));
    }
}
