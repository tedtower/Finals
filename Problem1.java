//877A

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int dem =0;
        Scanner input = new Scanner(System.in);
        String s ;
        s = input.nextLine();

        String [] g = {"Danil", "Olya", "Slava", "Ann" , "Nikita"};
        for(int i = 0 ; i < 5 ; i++){
            int id = 0;
            //System.out.println(i);
            while(s.indexOf(g[i],id) != -1){
                if(id >= s.length()) break;
                id = s.indexOf(g[i],id) + 1;

                dem ++;
            }

        }

        if(dem == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
