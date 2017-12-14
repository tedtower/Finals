/**
 *Problem 873A - Chores
*/

import java.util.Scanner;

public class Chores {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int s = 0;
        for (int i = 0; i < n - k; i++) {
            s += sc.nextInt ();
        }

        System.out.println (s + (k * x));
    }

}
