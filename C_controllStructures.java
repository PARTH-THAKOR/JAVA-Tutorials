// CONTROL STRUCTURES

public class C_controllStructures {
    public static void main(String[] args) {

        // If Else If Stetment
        int a = 6;

        if (a < 5) {
            System.out.println("Hi");
        } else if (a == 6) {
            System.out.println("Hello");
        } else {
            System.out.println("Nice");
        }

        // Switch Stetments
        int b = 7;

        switch (b) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;
            case 7:
                System.out.println(7);
                break;
            default:
                System.out.println("Not available");
                break;
        }

        // For Loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // While Loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Do While Loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        // Break Stetment
        for (int j2 = 0; j2 < 5; j2++) {
            if (j2 == 3) {
                break;
            } else {
                System.out.println(j2);
            }
        }

        // Continue Stetment
        for (int j2 = 0; j2 < 5; j2++) {
            if (j2 == 3) {
                continue;
            }
            System.out.println(j2);
        }
    }
}
