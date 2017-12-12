//Problem 870C - Maximum splitting

import java.util.Scanner;

public class MaximumSplitting {

	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		for(int i = 0; i < n; i++) {
			int k = console.nextInt();
			int num = 0;
			if(k % 2 == 1) {
				k-= 9;
				num++;
			}
			if(k % 4 != 0) {
				k -= 6;
				num++;
			}
			num += k / 4;
			if(k < 0 | k % 4 != 0) {
				System.out.println(-1);
			} else {
				System.out.println(num);
			}
		}
	}
}