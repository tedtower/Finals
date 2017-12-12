import java.util.Scanner;

public class SlavaAndTanks {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n,u;
		n=sc.nextInt();
		u=n+n/2;
		System.out.println(u);
		for (i=2;i<=n;i+=2)
			System.out.print(i+" ");
		for (i=1;i<=n;i+=2)
			System.out.print(i+" ");
		for (i=2;i<=n;i+=2)
			System.out.print(i+" ");
	}
}