//877C
import java.util.Scanner;

public class GlobalMembers {
    public static void main (String[]args ) {

        Scanner kbd = new Scanner(System.in);

        int input = kbd.nextInt();

        if (input % 2 == 0) {
            System.out.print(input / 2 * 3);
            System.out.print("\n");

            for (int i = 1; i != input + 1; i += 2) {
                System.out.print(i);
                System.out.print(" ");
            }

            for (int i = 2; i != input + 2; i += 2)
            {
                System.out.print(i);
                System.out.print(" ");
            }

            for (int i = 1; i != input + 1; i += 2)
            {
                System.out.print(i);
                System.out.print(" ");
            }

            System.out.print("\n");
        } else {
            System.out.print((input + 1) / 2 + input / 2 * 2);
            System.out.print("\n");

            for (int i = 2; i != input + 1; i += 2) {
                System.out.print(i);
                System.out.print(" ");
            }

            for (int i = 1; i != input + 2; i += 2) {
                System.out.print(i);
                System.out.print(" ");
            }

            for (int i = 2; i != input + 1; i += 2) {
                System.out.print(i);
                System.out.print(" ");
            }

            System.out.print("\n");
        }
    }
}