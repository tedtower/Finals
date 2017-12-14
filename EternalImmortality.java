/**
 * Problem 869B - The Eternal Immortality
 */

import java.util.Scanner;

public class EternalImmortality {

    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        long a = in.nextLong ();
        long b = in.nextLong ();
        long ans = 1;
        for (long i = a + 1; i <= b && ans != 0; i++) {
            ans = ans * i % 10;
        }
        System.out.println (ans);
    }
}
