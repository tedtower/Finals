import java.util.*;
public class BoryasDiagnosis{
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		int t;
		int a;
		int b;
		int mini=0;
		t = scan.nextInt();
		while (t > 0) {
			t--;
			a =scan.nextInt();
			b =scan.nextInt();
		if(a>mini) {
			mini=a;
			continue;
	}
			int k=1;
			while(a+k*b<=mini)
			k++;
			mini= a+k*b;
		}
		System.out.println(mini);
	}
	}