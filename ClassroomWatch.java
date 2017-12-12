/**
 *Problem 875A - Classroom Watch
 *@author Melissa
 */
import java.util.*;
public final class ClassroomWatch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		int t=0;
		int[] L = new int[90];
			n = input.nextInt();
			for(int i=1;i<=81;i++){
				int x=n-i;
				int sum=0;
					while(x>0){
						sum+=x%10;x/=10;
					}
				if(sum == i){
					L[t++]=n-i;
				}
			}
			System.out.println(t);
		for(int i=t-1; i>=0; i--)
			System.out.println(L[i]);
	}
}