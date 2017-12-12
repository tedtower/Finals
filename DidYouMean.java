//858C
import java.util.Scanner;

class DidYouMean {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.next();
        int n = input.length();
        int count = 0;
        boolean isEqual = true;

        for (int i = 0; i < n; i++) {
            if ((input.charAt(i) == 'a') || (input.charAt(i) == 'o') || (input.charAt(i) == 'e') || (input.charAt(i) == 'i') || (input.charAt(i) == 'u')) {
                System.out.print(input.charAt(i));
                count = 0;
                isEqual = true;
            } else {
                if (count == 0) {
                    System.out.print(input.charAt(i));
                    count++;
                } else if (count == 1) {
                    System.out.print(input.charAt(i));
                    isEqual = isEqual && ((input.charAt(i) == input.charAt(i - 1)));
                    count++;
                } else
                if (count > 1) {
                    if (isEqual && (input.charAt(i) == input.charAt(i - 1))) {
                        System.out.print(input.charAt(i));
                        count++;
                    } else {
                        System.out.print(" " + input.charAt(i));
                        count=1;
                        isEqual = true;
                    }
                }
            }
        }

    }
}