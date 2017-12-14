/**
 * Problem 887A
 */

import java.util.Scanner;

public class Div64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine ();
        int state = 0;

        for (char c : s.toCharArray ()) {
            if (c == '1' && state == 0) {
                state = 1;
            }
            else if (c == '0' && state > 0) {
                state++;
            }
            if (state == 7) {
                break;
            }
        }

        if (state == 7) {
            System.out.println ("yes");
        }
        else {
            System.out.println ("no");
        }
    }
}
