import java.util.Scanner;
public class Maxim {

	public static void main(String args []){

   int n, k;
   Scanner kbd = new Scanner(System.in);


   	n = kbd.nextInt();
   	k = kbd.nextInt();


   if(n == k){
   	System.out.printf("0 0\n");
   }
   else if(k == 0){
   	System.out.printf("0 0\n");
   }
   else
   	System.out.printf("1 ");

   int ans = n;
   if (k <= n/3){
   	System.out.printf("%d\n", n-k);
   }
   else
   	System.out.printf("%d\n", n-k);


	}

}