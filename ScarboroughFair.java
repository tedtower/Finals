/**
 *Problem 897A - Scarborough Fair
 *@author Carla
 */
import java.util.Scanner;

public class ScarboroughFair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
			sc.nextLine();
		char[] s=sc.nextLine().toCharArray();
			for(int i=0; i<m; i++) {
				int l=sc.nextInt();
				int r=sc.nextInt();
				char c1=sc.next().charAt(0);
				char c2=sc.next().charAt(0);
					sc.nextLine();
				for(int j=l-1; j<r; j++){
					if(s[j]==c1)s[j]=c2;
				}
			}
				StringBuilder sb=new StringBuilder();
			for(char c:s)sb.append(c);
				System.out.println(sb);
	}

}