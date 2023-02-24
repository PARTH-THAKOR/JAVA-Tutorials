// ARRAYS

public class D_array {
    public static void main(String[] args) {

        // Array Declaration
        int ary[] = { 1, 2, 3, 7, 5 };

        // Array Element Acsess
        System.out.println(ary[2]);
        System.out.println(ary[1]);
        System.out.println(ary[4]);

        // Array Elements Printing by For Loop
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }

        // Array Elements Printing by ForEach Loop
        for (int i : ary) {
            System.out.println(i);
        }

        // 2D Array Declaration
        int ar2d[][] = { { 1, 2 }, { 3, 4 } };

        // 2D Array Printing
        for (int i = 0; i < ar2d.length; i++) {
            for (int j = 0; j < ar2d.length; j++) {
                System.out.println(ar2d[i][j]);
            }
        }
    }
}
