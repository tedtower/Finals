import java.util.Scanner;

public class spit {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int y = src.nextInt();
		while(y-- >0) {
			solve(src.nextInt());
		}
		src.close();

	}

	public static void solve(int x) {
		if(x<4)System.out.println(-1);
		else if((x&1)==0) {//even number
		 	System.out.println(x/4);
		}else {
			int z = x-9;
			if(z==0)System.out.println(1);
			else if(z<4)System.out.println(-1);
			else {
				System.out.println(1+z/4);
			}
		}
	}

}