//851A

import java.util.*;

public class ArpaAndResearchInMexicanWave {
    public static void main(String args[]) {
        Scanner kbd = new Scanner(System.in);

        int n = kbd.nextInt();

        int k = kbd.nextInt();

        int t = kbd.nextInt();

        if (t <= k && t <= n){
            System.out.println(t);

        }else if (t <= n){
            System.out.println(k);

        }else{
            System.out.print(k-(t-n));
        }
    }
}