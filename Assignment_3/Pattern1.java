
/**
 * 29.
 * 1
 * 2 3 4
 * 5 6 7 8 9
 */

public class Pattern1 {
    public static void main(String args[]) {
        int i, j, k = 1;

        System.out.println("Pattern is: ");

        for (i = 1; i <= 5; i = i + 2) {
            for (j = 1; j <= i; j++) {
                System.out.print(" " + (k++));
            }
            System.out.println("");
        }

    }
}